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

//        ApplicantRecord recordOne = new ApplicantRecord.ApplicantRecordBuilder()
//               .withApplicantInformation(new String[]{"ID", "vignesh", "rajkumar", "M", "040695", "600007", "BE", "G", "English", "Satbam", "Univ"})
//                .withProfessions("Doc")
//                .withSkillScores(new int[] {1,2,3,4,5})
//                .withEmotionalQuotient(10, "msg")
//                .withPersonalityAssessment("moom")
//                .build();
//
//        System.out.println(recordOne);


        List<ApplicantInput> applicantInputs = CSVParser.getApplicantInputs("input.csv");


    }

}
