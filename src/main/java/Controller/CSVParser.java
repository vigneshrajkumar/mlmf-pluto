package Controller;

import Logic.SectionFour;
import Logic.SectionOne;
import Logic.SectionThree;
import Logic.SectionTwo;
import Model.ApplicantInput;
import javafx.scene.control.Alert;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Queue;

public class CSVParser {

    public static void validateCSV(String filename){

        try {
            Reader in = new FileReader(filename);
            Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().withHeader(
                    "ID", "FirstName", "LastName", "Gender", "DateOfBirth", "Locality", "Pincode", "Class", "Section", "MediumOfInstruction", "InstitutionName", "InstitutionCategory",
                    "S1-1",
                    "S2-A1", "S2-A2", "S2-A3",
                    "S2-B1", "S2-B2", "S2-B3",
                    "S2-C1", "S2-C2", "S2-C3",
                    "S2-D1", "S2-D2", "S2-D3",
                    "S2-E1", "S2-E2", "S2-E3",
                    "S2-F1", "S2-F2", "S2-F3",
                    "S3-A1", "S3-A2", "S3-A3", "S3-A4", "S3-A5", "S3-A6", "S3-A7", "S3-A8",
                    "S3-B1", "S3-B2", "S3-B3", "S3-B4", "S3-B5", "S3-B6", "S3-B7", "S3-B8", "S3-B9", "S3-B10", "S3-B11", "S3-B12",
                    "S4-1").parse(in);

            int recordCount = 1;

            for (CSVRecord record : records) {

                //TODO:vr validate applicant info

                boolean section1Validaity = SectionOne.validate(record.get("S1-1"));

                boolean section2Validaity = SectionTwo.validate(new String[] {
                        record.get("S2-A1"),
                        record.get("S2-A2"),
                        record.get("S2-A3"),

                        record.get("S2-B1"),
                        record.get("S2-B2"),
                        record.get("S2-B3"),

                        record.get("S2-C1"),
                        record.get("S2-C2"),
                        record.get("S2-C3"),

                        record.get("S2-D1"),
                        record.get("S2-D2"),
                        record.get("S2-D3"),

                        record.get("S2-E1"),
                        record.get("S2-E2"),
                        record.get("S2-E3"),

                        record.get("S2-F1"),
                        record.get("S2-F2"),
                        record.get("S2-F3")
                });

                boolean section3Validaity = SectionThree.validate(new String[] {
                        record.get("S3-A1"),
                        record.get("S3-A2"),
                        record.get("S3-A3"),
                        record.get("S3-A4"),
                        record.get("S3-A5"),
                        record.get("S3-A6"),
                        record.get("S3-A7"),
                        record.get("S3-A8"),

                        record.get("S3-B1"),
                        record.get("S3-B2"),
                        record.get("S3-B3"),
                        record.get("S3-B4"),
                        record.get("S3-B5"),
                        record.get("S3-B6"),
                        record.get("S3-B7"),
                        record.get("S3-B8"),
                        record.get("S3-B9"),
                        record.get("S3-B10"),
                        record.get("S3-B11"),
                        record.get("S3-B12")
                });

                boolean section4Validaity = SectionFour.validate(record.get("S4-1"));

                if (!(section1Validaity && section2Validaity && section3Validaity && section4Validaity)){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("MLMF Report Generator");
                    alert.setHeaderText("Error: input CSV is inconsistent");
                    alert.setContentText("Ooops, there is an error in record #" + recordCount);

                    alert.showAndWait();
                }
                recordCount++;
            }
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("MLMF Report Generator");
                alert.setHeaderText("Info: input CSV is consistent");
                // TODO:vr use if check and custamize message?
                alert.setContentText("Input CSV file is found in order and all " + recordCount + " record(s) is(are) consistent");
                alert.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getApplicantInputs(String fileName, Queue<ApplicantInput> queue){

        try {

            Reader in = new FileReader(fileName);

            Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().withHeader(
                    "ID", "FirstName", "LastName", "Gender", "DateOfBirth", "Locality", "Pincode", "Class", "Section", "MediumOfInstruction", "InstitutionName", "InstitutionCategory",
                    "S1-1",
                    "S2-A1", "S2-A2", "S2-A3",
                    "S2-B1", "S2-B2", "S2-B3",
                    "S2-C1", "S2-C2", "S2-C3",
                    "S2-D1", "S2-D2", "S2-D3",
                    "S2-E1", "S2-E2", "S2-E3",
                    "S2-F1", "S2-F2", "S2-F3",
                    "S3-A1", "S3-A2", "S3-A3", "S3-A4", "S3-A5", "S3-A6", "S3-A7", "S3-A8",
                    "S3-B1", "S3-B2", "S3-B3", "S3-B4", "S3-B5", "S3-B6", "S3-B7", "S3-B8", "S3-B9", "S3-B10", "S3-B11", "S3-B12",
                    "S4-1").parse(in);

            for (CSVRecord record : records) {

                ApplicantInput applicantInput = new ApplicantInput.ApplicantInputBuilder()
                        .withApplicantInfo(
                                record.get("ID"),
                                record.get("FirstName"),
                                record.get("LastName"),
                                record.get("Gender"),
                                record.get("DateOfBirth"),
                                record.get("Locality"),
                                record.get("Pincode"),
                                record.get("Class"),
                                record.get("Section"),
                                record.get("MediumOfInstruction"),
                                record.get("InstitutionName"),
                                record.get("InstitutionCategory"))
                        .withSectionOneInput(record.get("S1-1"))
                        .withSectionTwoInput(new String[]{
                                record.get("S2-A1"),
                                record.get("S2-A2"),
                                record.get("S2-A3"),

                                record.get("S2-B1"),
                                record.get("S2-B2"),
                                record.get("S2-B3"),

                                record.get("S2-C1"),
                                record.get("S2-C2"),
                                record.get("S2-C3"),

                                record.get("S2-D1"),
                                record.get("S2-D2"),
                                record.get("S2-D3"),

                                record.get("S2-E1"),
                                record.get("S2-E2"),
                                record.get("S2-E3"),

                                record.get("S2-F1"),
                                record.get("S2-F2"),
                                record.get("S2-F3")
                        })
                        .withSectionThreeInput(new String[]{
                                record.get("S3-A1"),
                                record.get("S3-A2"),
                                record.get("S3-A3"),
                                record.get("S3-A4"),
                                record.get("S3-A5"),
                                record.get("S3-A6"),
                                record.get("S3-A7"),
                                record.get("S3-A8"),

                                record.get("S3-B1"),
                                record.get("S3-B2"),
                                record.get("S3-B3"),
                                record.get("S3-B4"),
                                record.get("S3-B5"),
                                record.get("S3-B6"),
                                record.get("S3-B7"),
                                record.get("S3-B8"),
                                record.get("S3-B9"),
                                record.get("S3-B10"),
                                record.get("S3-B11"),
                                record.get("S3-B12")
                        })
                        .withSectionFourInput(record.get("S4-1"))
                        .build();

                queue.add(applicantInput);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
