package Model;

public class ApplicantRecord {
    private String id;

    // Applicant Information
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth; // TODO:vr convert to Date
    private String pincode;
    private String clazz;
    private String section;
    private String mediumOfInstruction;
    private String institutionName;
    private String institutionCategory;

    // Section 1
    private String profession;

    // Section 2
    private int reading;
    private int writing;
    private int studying;
    private int memorizing;
    private int preparing;
    private int timeManagement;

    // Section 3
    private int emotionalQuotient;
    private String emotionalQuotientWriteup;

    // Section 4
    private String personalityWriteup;

    private ApplicantRecord(String id, String firstName, String lastName, String gender, String dateOfBirth, String pincode, String clazz, String section, String mediumOfInstruction, String institutionName, String institutionCategory, String profession, int reading, int writing, int studying, int memorizing, int preparing, int timeManagement, int emotionalQuotient, String emotionalQuotientWriteup, String personalityWriteup) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.pincode = pincode;
        this.clazz = clazz;
        this.section = section;
        this.mediumOfInstruction = mediumOfInstruction;
        this.institutionName = institutionName;
        this.institutionCategory = institutionCategory;
        this.profession = profession;
        this.reading = reading;
        this.writing = writing;
        this.studying = studying;
        this.memorizing = memorizing;
        this.preparing = preparing;
        this.timeManagement = timeManagement;
        this.emotionalQuotient = emotionalQuotient;
        this.emotionalQuotientWriteup = emotionalQuotientWriteup;
        this.personalityWriteup = personalityWriteup;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPincode() {
        return pincode;
    }

    public String getClazz() {
        return clazz;
    }

    public String getSection() {
        return section;
    }

    public String getMediumOfInstruction() {
        return mediumOfInstruction;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public String getInstitutionCategory() {
        return institutionCategory;
    }

    public String getProfession() {
        return profession;
    }

    public int getReading() {
        return reading;
    }

    public int getStudying() {
        return studying;
    }

    public int getWriting() {
        return writing;
    }

    public int getMemorizing() {
        return memorizing;
    }

    public int getPreparing() {
        return preparing;
    }

    public int getTimeManagement() {
        return timeManagement;
    }

    public int getEmotionalQuotient() {
        return emotionalQuotient;
    }

    public String getEmotionalQuotientWriteup() {
        return emotionalQuotientWriteup;
    }

    public String getPersonalityWriteup() {
        return personalityWriteup;
    }

    @Override
    public String toString() {
        return "ApplicantRecord{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", pincode='" + pincode + '\'' +
                ", clazz='" + clazz + '\'' +
                ", section='" + section + '\'' +
                ", mediumOfInstruction='" + mediumOfInstruction + '\'' +
                ", institutionName='" + institutionName + '\'' +
                ", institutionCategory='" + institutionCategory + '\'' +
                ", professions=" + profession +
                ", reading=" + reading +
                ", writing=" + writing +
                ", stdying=" + studying +
                ", memorizing=" + memorizing +
                ", preparing=" + preparing +
                ", timeManagement=" + timeManagement +
                ", emotionalQuotient=" + emotionalQuotient +
                ", emotionalQuotientWriteup='" + emotionalQuotientWriteup + '\'' +
                ", personalityWriteup='" + personalityWriteup + '\'' +
                '}';
    }

    public static class ApplicantRecordBuilder{

        private String id;

        // Applicant Information
        private String firstName;
        private String lastName;
        private String gender;
        private String dateOfBirth; // TODO:vr convert to Date
        private String pincode;
        private String clazz;
        private String section;
        private String mediumOfInstruction;
        private String institutionName;
        private String institutionCategory;

        // Section 1
        private String profession;

        // Section 2
        private int reading;
        private int writing;
        private int studying;
        private int memorizing;
        private int preparing;
        private int timeManagement;

        // Section 3
        private int emotionalQuotient;
        private String emotionalQuotientWriteup;

        // Section 4
        private String personalityWriteup;

        public ApplicantRecordBuilder withApplicantInformation(String[] applicantInfo ){
            this.id = applicantInfo[0];
            this.firstName = applicantInfo[1];
            this.lastName = applicantInfo[2];
            this.gender = applicantInfo[3];
            this.dateOfBirth = applicantInfo[4];
            this.pincode = applicantInfo[5];
            this.clazz = applicantInfo[6];
            this.section = applicantInfo[7];
            this.mediumOfInstruction = applicantInfo[8];
            this.institutionName = applicantInfo[9];
            this.institutionCategory = applicantInfo[10];
            return this;
        }

        public ApplicantRecordBuilder withProfessions(String profession){
            this.profession = profession;
            return this;
        }

        public ApplicantRecordBuilder withSkillScores(int[] skillScores){
            this.reading = skillScores[0];
            this.writing = skillScores[1];
            this.studying = skillScores[2];
            this.memorizing = skillScores[3];
            this.preparing = skillScores[4];
            this.timeManagement = skillScores[5];
            return this;
        }

        public ApplicantRecordBuilder withEmotionalQuotient(int score, String message){
            this.emotionalQuotient = score;
            this.emotionalQuotientWriteup = message;
            return this;
        }

        public ApplicantRecordBuilder withPersonalityAssessment(String message){
            this.personalityWriteup = message;
            return this;
        }

        public ApplicantRecord build(){
            return new ApplicantRecord(id, firstName, lastName, gender, dateOfBirth, pincode, clazz, section, mediumOfInstruction, institutionName, institutionCategory, profession, reading, writing, studying, memorizing, preparing, timeManagement, emotionalQuotient, emotionalQuotientWriteup, personalityWriteup);
        }

    }
}
