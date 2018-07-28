package Controller;

import Model.ApplicantInput;
import Model.ApplicantRecord;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Home {

    public static void main(String[] args) {
        System.out.println("yo");



        List<ApplicantInput> applicantInputs = CSVParser.getApplicantInputs("input.csv");

        for (ApplicantInput applicantInput : applicantInputs){
            ApplicantRecord record = ReportBuilder.generateReport(applicantInput);

//            System.out.println(record);

            PDFGenerator.generatePDF(record);
        }


    }

}
