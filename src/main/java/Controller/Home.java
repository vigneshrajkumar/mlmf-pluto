package Controller;

import Model.ApplicantRecord;

public class Home {

    public static void main(String[] args) {
        System.out.println("yo");

        ApplicantRecord recordOne = new ApplicantRecord.ApplicantRecordBuilder()
                .withFirstName("Vignesh")
                .withProfessions(new String[]{"doctor", "engineer"})
                .withReadingScore(10)
                .withWritingScore(10)
                .build();

        System.out.println(recordOne);

    }

}
