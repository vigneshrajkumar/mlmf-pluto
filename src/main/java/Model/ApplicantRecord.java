package Model;

import java.util.Arrays;

public class ApplicantRecord {

    public ApplicantRecord(String firstName, String[] professions, int readingScore, int writingScore) {
        this.firstName = firstName;
        this.professions = professions;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    @Override
    public String toString() {
        return "ApplicantRecord{" +
                "firstName='" + firstName + '\'' +
                ", professions=" + Arrays.toString(professions) +
                ", readingScore=" + readingScore +
                ", writingScore=" + writingScore +
                '}';
    }

    private String firstName;

    private String[] professions;

    private int readingScore;
    private int writingScore;


    public static class ApplicantRecordBuilder{
        private String firstName;

        private String[] professions;

        private int readingScore;
        private int writingScore;

        public ApplicantRecordBuilder withFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public ApplicantRecordBuilder withProfessions(String[] professions){
            this.professions = professions;
            return this;
        }

        public ApplicantRecordBuilder withReadingScore(int readingScore){
            this.readingScore = readingScore;
            return this;
        }

        public ApplicantRecordBuilder withWritingScore(int writingScore){
            this.writingScore = writingScore;
            return this;
        }

        public ApplicantRecord build(){
            return new ApplicantRecord(firstName, professions, readingScore, writingScore);
        }
    }
}
