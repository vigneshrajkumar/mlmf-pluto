package Controller;

import Model.ApplicantInput;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {
    public static List<ApplicantInput> getApplicantInputs(String fileName){
        List<ApplicantInput> applicantInputs = new ArrayList<>();

        try {

            Reader in = new FileReader(fileName);

            Iterable<CSVRecord> records = CSVFormat.RFC4180.withHeader("ID", "FirstName", "LastName").parse(in);

            for (CSVRecord record : records) {

                String lastName = record.get("LastName");
                String firstName = record.get("FirstName");

                ApplicantInput applicantInput = new ApplicantInput();

                applicantInputs.add(applicantInput);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  applicantInputs;
    }
}
