package Controller;

import Model.ApplicantRecord;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.text.pdf.qrcode.WriterException;
import com.sun.scenario.effect.ImageData;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public class PDFGenerator {

    private static byte[] getQRCodeImage(String text, int width, int height) throws IOException, com.google.zxing.WriterException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

        ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "PNG", pngOutputStream);

        return pngOutputStream.toByteArray();
    }

    public static void generatePDF(ApplicantRecord record){

        Document doc = new Document();

        try {

            PdfWriter.getInstance(doc, new FileOutputStream(new File("output/"+ record.getId() +".pdf")));

            doc.open();

            Image qrCode = Image.getInstance(getQRCodeImage(record.getId(), 120,120));
            qrCode.setAbsolutePosition(440,600);

            Font heading1Font = FontFactory.getFont(FontFactory.HELVETICA, 24, Font.BOLD);
            Font heading2Font = FontFactory.getFont(FontFactory.HELVETICA, 18, Font.BOLDITALIC);
            Font subHeadingFont = FontFactory.getFont(FontFactory.HELVETICA, 14, Font.BOLD);
            Font paragraphFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
            Font footerFont = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.NORMAL);

            LineSeparator ls = new LineSeparator();

            Paragraph heading1 = new Paragraph("My Life - My Future", heading1Font);
            Paragraph heading2 = new Paragraph("A Career Guidance Programme by The Ministro Foundation", heading2Font);

            Paragraph bottomFooter = new Paragraph("www.ministro.in", footerFont);
            bottomFooter.setAlignment(Element.ALIGN_CENTER);

            Paragraph applicantPersonalityHeader = new Paragraph("Your Personality Type: \n", subHeadingFont);
            Paragraph applicantAcademicsHeader = new Paragraph("Your Academic Proficiency: \n", subHeadingFont);
            Paragraph applicantEmotionalHeader = new Paragraph("Your Emotional Quotient: \n", subHeadingFont);
            Paragraph applicantProfessionsHeader = new Paragraph("Your Suitable Professions: \n", subHeadingFont);

            Paragraph applicantInfo = new Paragraph("Applicant ID: " + record.getId() + " \nName: "+ record.getFirstName() + " " + record.getLastName() +" \nClass: "+ record.getClazz() +" | Section: "+ record.getSection() +"  \nInstitution: "+ record.getInstitutionName() + " | " + record.getInstitutionCategory() + " (" + record.getMediumOfInstruction() + ")\nDate: " + LocalDate.now() , paragraphFont);

            Paragraph applicantAcademicsInfo = new Paragraph("Reading: "+ record.getReading() +"%\nWriting: "+ record.getWriting() +"%\nStudying: "+ record.getStudying() +"%\nMemorizing: "+ record.getMemorizing() +"%\nPreparing: "+ record.getPreparing() +"%\nTime Management: "+ record.getTimeManagement() +"%", paragraphFont);

            PdfPTable table = new PdfPTable(2);

            PdfPCell readingCell = new PdfPCell(new Phrase("Reading: " + record.getReading() + "%"));
            readingCell.setPadding(5);
            readingCell.setHorizontalAlignment(Element.ALIGN_LEFT);
            readingCell.setBorder(Rectangle.NO_BORDER);

            PdfPCell writingCell = new PdfPCell(new Phrase("Writing: " + record.getWriting() + "%"));
            writingCell.setPadding(5);
            writingCell.setHorizontalAlignment(Element.ALIGN_LEFT);
            writingCell.setBorder(Rectangle.NO_BORDER);

            PdfPCell studyingCell = new PdfPCell(new Phrase("Studying: " + record.getStudying() + "%"));
            studyingCell.setPadding(5);
            studyingCell.setHorizontalAlignment(Element.ALIGN_LEFT);
            studyingCell.setBorder(Rectangle.NO_BORDER);

            PdfPCell memorizingCell = new PdfPCell(new Phrase("Memorizing: " + record.getMemorizing() + "%"));
            memorizingCell.setPadding(5);
            memorizingCell.setHorizontalAlignment(Element.ALIGN_LEFT);
            memorizingCell.setBorder(Rectangle.NO_BORDER);

            PdfPCell preparingCell = new PdfPCell(new Phrase("Preparing: " + record.getPreparing() + "%"));
            preparingCell.setPadding(5);
            preparingCell.setHorizontalAlignment(Element.ALIGN_LEFT);
            preparingCell.setBorder(Rectangle.NO_BORDER);

            PdfPCell timeManagement = new PdfPCell(new Phrase("Time Management: " + record.getTimeManagement() + "%"));
            timeManagement.setPadding(5);
            timeManagement.setBorder(Rectangle.NO_BORDER);

            table.addCell(readingCell);
            table.addCell(writingCell);
            table.addCell(studyingCell);
            table.addCell(memorizingCell);
            table.addCell(preparingCell);
            table.addCell(timeManagement);

            Paragraph applicantPersonalityInfo = new Paragraph(record.getPersonalityWriteup());
            applicantPersonalityInfo.setAlignment(Element.ALIGN_JUSTIFIED);

            Paragraph applicantEmotionalScore = new Paragraph("Score: " + record.getEmotionalQuotient() + " / 20");
            Paragraph applicantEmotionalMessage = new Paragraph(record.getEmotionalQuotientWriteup());
            applicantEmotionalMessage.setAlignment(Element.ALIGN_JUSTIFIED);

            Paragraph applicantProfessionsInfo = new Paragraph(record.getProfession());

            doc.add(heading1);
            doc.add(heading2);
            doc.add(new Phrase("\n"));
            doc.add(ls);
            doc.add(applicantInfo);
            doc.add(qrCode);

            doc.add(new Phrase("\n"));
            doc.add(applicantPersonalityHeader);
            doc.add(applicantPersonalityInfo);
            doc.add(new Phrase("\n"));
            doc.add(applicantAcademicsHeader);
//            doc.add(applicantAcademicsInfo);
            doc.add(table);
            doc.add(new Phrase("\n"));
            doc.add(applicantEmotionalHeader);
            doc.add(applicantEmotionalScore);
            doc.add(applicantEmotionalMessage);
            doc.add(new Phrase("\n"));
            doc.add(applicantProfessionsHeader);
            doc.add(applicantProfessionsInfo);
            doc.add(new Phrase("\n"));
            doc.add(ls);
            doc.add(bottomFooter);

            doc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
