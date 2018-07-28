package Model;

public class ApplicantInput {

    public ApplicantInput(String id, String firstName, String lastName, String gender, String dateOfBirth, String locality,String pincode, String clazz, String section, String mediumOfInstruction, String institutionName, String institutionCategory, String s1, String s2_a1, String s2_a2, String s2_a3, String s2_b1, String s2_b2, String s2_b3, String s2_c1, String s2_c2, String s2_c3, String s2_d1, String s2_d2, String s2_d3, String s2_e1, String s2_e2, String s2_e3, String s2_f1, String s2_f2, String s2_f3, String s3_a1, String s3_a2, String s3_a3, String s3_a4, String s3_a5, String s3_a6, String s3_a7, String s3_a8, String s3_b1, String s3_b2, String s3_b3, String s3_b4, String s3_b5, String s3_b6, String s3_b7, String s3_b8, String s3_b9, String s3_b10, String s3_b11, String s3_b12, String s4) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.locality = locality;
        this.pincode = pincode;
        this.clazz = clazz;
        this.section = section;
        this.mediumOfInstruction = mediumOfInstruction;
        this.institutionName = institutionName;
        this.institutionCategory = institutionCategory;
        this.s1 = s1;
        this.s2_a1 = s2_a1;
        this.s2_a2 = s2_a2;
        this.s2_a3 = s2_a3;
        this.s2_b1 = s2_b1;
        this.s2_b2 = s2_b2;
        this.s2_b3 = s2_b3;
        this.s2_c1 = s2_c1;
        this.s2_c2 = s2_c2;
        this.s2_c3 = s2_c3;
        this.s2_d1 = s2_d1;
        this.s2_d2 = s2_d2;
        this.s2_d3 = s2_d3;
        this.s2_e1 = s2_e1;
        this.s2_e2 = s2_e2;
        this.s2_e3 = s2_e3;
        this.s2_f1 = s2_f1;
        this.s2_f2 = s2_f2;
        this.s2_f3 = s2_f3;
        this.s3_a1 = s3_a1;
        this.s3_a2 = s3_a2;
        this.s3_a3 = s3_a3;
        this.s3_a4 = s3_a4;
        this.s3_a5 = s3_a5;
        this.s3_a6 = s3_a6;
        this.s3_a7 = s3_a7;
        this.s3_a8 = s3_a8;
        this.s3_b1 = s3_b1;
        this.s3_b2 = s3_b2;
        this.s3_b3 = s3_b3;
        this.s3_b4 = s3_b4;
        this.s3_b5 = s3_b5;
        this.s3_b6 = s3_b6;
        this.s3_b7 = s3_b7;
        this.s3_b8 = s3_b8;
        this.s3_b9 = s3_b9;
        this.s3_b10 = s3_b10;
        this.s3_b11 = s3_b11;
        this.s3_b12 = s3_b12;
        this.s4 = s4;
    }

    private String id;

    // Applicant Information
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth; // TODO:vr convert to Date
    private String locality;
    private String pincode;
    private String clazz;
    private String section;
    private String mediumOfInstruction;
    private String institutionName;
    private String institutionCategory;

    // Section 1
    private String s1;

    // Section 2
    private String s2_a1;
    private String s2_a2;
    private String s2_a3;

    private String s2_b1;
    private String s2_b2;
    private String s2_b3;

    private String s2_c1;
    private String s2_c2;
    private String s2_c3;

    private String s2_d1;
    private String s2_d2;
    private String s2_d3;

    private String s2_e1;
    private String s2_e2;
    private String s2_e3;

    private String s2_f1;
    private String s2_f2;
    private String s2_f3;

    // Section 3
    private String s3_a1;
    private String s3_a2;
    private String s3_a3;
    private String s3_a4;
    private String s3_a5;
    private String s3_a6;
    private String s3_a7;
    private String s3_a8;

    private String s3_b1;
    private String s3_b2;
    private String s3_b3;
    private String s3_b4;
    private String s3_b5;
    private String s3_b6;
    private String s3_b7;
    private String s3_b8;
    private String s3_b9;
    private String s3_b10;
    private String s3_b11;
    private String s3_b12;

    private String s4;

    public String[] getApplicantInfo(){
        return new String[]{id, firstName, lastName, gender, dateOfBirth, pincode, clazz, section, mediumOfInstruction, institutionName, institutionCategory};
    }

    public int getProfessionAssessmentInput(){
        return Integer.parseInt(s1);
    }

    public String[] getSkillAssessmentInput(){
        return new String[] { s2_a1, s2_a2, s2_a3,
                s2_b1, s2_b2, s2_b3,
                s2_c1, s2_c2, s2_c3,
                s2_d1, s2_d2, s2_d3,
                s2_e1, s2_e2, s2_e3,
                s2_f1, s2_f2, s2_f3
        };
    }

    public String[] getEmotionalAssessmentInput(){
        return new String[] {
        s3_a1, s3_a2, s3_a3, s3_a4, s3_a5, s3_a6, s3_a7, s3_a8,
        s3_b1, s3_b2, s3_b3, s3_b4, s3_b5, s3_b6, s3_b7, s3_b8, s3_b9, s3_b10, s3_b11, s3_b12
        };
    }

    public int getPersonalityAssessmentInput(){
        return Integer.parseInt(s4);
    }

    @Override
    public String toString() {
        return "ApplicantInput{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", pincode='" + pincode + '\'' +
                ", locality='" + locality + '\'' +
                ", clazz='" + clazz + '\'' +
                ", section='" + section + '\'' +
                ", mediumOfInstruction='" + mediumOfInstruction + '\'' +
                ", institutionName='" + institutionName + '\'' +
                ", institutionCategory='" + institutionCategory + '\'' +
                ", s1=" + s1 +
                ", s2_a1='" + s2_a1 + '\'' +
                ", s2_a2='" + s2_a2 + '\'' +
                ", s2_a3='" + s2_a3 + '\'' +
                ", s2_b1='" + s2_b1 + '\'' +
                ", s2_b2='" + s2_b2 + '\'' +
                ", s2_b3='" + s2_b3 + '\'' +
                ", s2_c1='" + s2_c1 + '\'' +
                ", s2_c2='" + s2_c2 + '\'' +
                ", s2_c3='" + s2_c3 + '\'' +
                ", s2_d1='" + s2_d1 + '\'' +
                ", s2_d2='" + s2_d2 + '\'' +
                ", s2_d3='" + s2_d3 + '\'' +
                ", s2_e1='" + s2_e1 + '\'' +
                ", s2_e2='" + s2_e2 + '\'' +
                ", s2_e3='" + s2_e3 + '\'' +
                ", s2_f1='" + s2_f1 + '\'' +
                ", s2_f2='" + s2_f2 + '\'' +
                ", s2_f3='" + s2_f3 + '\'' +
                ", s3_a1='" + s3_a1 + '\'' +
                ", s3_a2='" + s3_a2 + '\'' +
                ", s3_a3='" + s3_a3 + '\'' +
                ", s3_a4='" + s3_a4 + '\'' +
                ", s3_a5='" + s3_a5 + '\'' +
                ", s3_a6='" + s3_a6 + '\'' +
                ", s3_a7='" + s3_a7 + '\'' +
                ", s3_a8='" + s3_a8 + '\'' +
                ", s3_b1='" + s3_b1 + '\'' +
                ", s3_b2='" + s3_b2 + '\'' +
                ", s3_b3='" + s3_b3 + '\'' +
                ", s3_b4='" + s3_b4 + '\'' +
                ", s3_b5='" + s3_b5 + '\'' +
                ", s3_b6='" + s3_b6 + '\'' +
                ", s3_b7='" + s3_b7 + '\'' +
                ", s3_b8='" + s3_b8 + '\'' +
                ", s3_b9='" + s3_b9 + '\'' +
                ", s3_b10='" + s3_b10 + '\'' +
                ", s3_b11='" + s3_b11 + '\'' +
                ", s3_b12='" + s3_b12 + '\'' +
                ", s4=" + s4 +
                '}';
    }

    public static class ApplicantInputBuilder{

        private String id;

        // Applicant Information
        private String firstName;
        private String lastName;
        private String gender;
        private String dateOfBirth; // TODO:vr convert to Date
        private String locality;
        private String pincode;
        private String clazz;
        private String section;
        private String mediumOfInstruction;
        private String institutionName;
        private String institutionCategory;

        // Section 1
        private String s1;

        // Section 2
        private String s2_a1;
        private String s2_a2;
        private String s2_a3;

        private String s2_b1;
        private String s2_b2;
        private String s2_b3;

        private String s2_c1;
        private String s2_c2;
        private String s2_c3;

        private String s2_d1;
        private String s2_d2;
        private String s2_d3;

        private String s2_e1;
        private String s2_e2;
        private String s2_e3;

        private String s2_f1;
        private String s2_f2;
        private String s2_f3;

        // Section 3
        private String s3_a1;
        private String s3_a2;
        private String s3_a3;
        private String s3_a4;
        private String s3_a5;
        private String s3_a6;
        private String s3_a7;
        private String s3_a8;

        private String s3_b1;
        private String s3_b2;
        private String s3_b3;
        private String s3_b4;
        private String s3_b5;
        private String s3_b6;
        private String s3_b7;
        private String s3_b8;
        private String s3_b9;
        private String s3_b10;
        private String s3_b11;
        private String s3_b12;

        private String s4;

        public ApplicantInputBuilder withApplicantInfo(String id, String firstName, String lastName, String gender, String dateOfBirth, String locality, String pincode, String clazz, String section, String mediumOfInstruction, String institutionName, String institutionCategory){

            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
            this.dateOfBirth = dateOfBirth;
            this.locality = locality;
            this.pincode = pincode;
            this.clazz = clazz;
            this.section = section;
            this.mediumOfInstruction = mediumOfInstruction;
            this.institutionName = institutionName;
            this.institutionCategory = institutionCategory;
            return this;
        }

        public ApplicantInputBuilder withSectionOneInput(String input){
            this.s1 = input;
            return this;
        }

        public ApplicantInputBuilder withSectionTwoInput(String[] input){
            this.s2_a1 = input[0];
            this.s2_a2 = input[1];
            this.s2_a3 = input[2];

            this.s2_b1 = input[3];
            this.s2_b2 = input[4];
            this.s2_b3 = input[5];

            this.s2_c1 = input[6];
            this.s2_c2 = input[7];
            this.s2_c3 = input[8];

            this.s2_d1 = input[9];
            this.s2_d2 = input[10];
            this.s2_d3 = input[11];

            this.s2_e1 = input[12];
            this.s2_e2 = input[13];
            this.s2_e3 = input[14];

            this.s2_f1 = input[15];
            this.s2_f2 = input[16];
            this.s2_f3 = input[17];
            return this;
        }

        public ApplicantInputBuilder withSectionThreeInput(String[] input){
            this.s3_a1 = input[0];
            this.s3_a2 = input[1];
            this.s3_a3 = input[2];
            this.s3_a4 = input[3];
            this.s3_a5 = input[4];
            this.s3_a6 = input[5];
            this.s3_a7 = input[6];
            this.s3_a8 = input[7];

            this.s3_b1 = input[8];
            this.s3_b2 = input[9];
            this.s3_b3 = input[10];
            this.s3_b4 = input[11];
            this.s3_b5 = input[12];
            this.s3_b6 = input[13];
            this.s3_b7 = input[14];
            this.s3_b8 = input[15];
            this.s3_b9 = input[16];
            this.s3_b10 = input[17];
            this.s3_b11 = input[19];
            this.s3_b12 = input[19];
            return this;
        }

        public ApplicantInputBuilder withSectionFourInput(String input){
            this.s4 = input;
            return this;
        }

        public ApplicantInput build(){
            return new ApplicantInput(id, firstName, lastName, gender, dateOfBirth, locality, pincode, clazz, section, mediumOfInstruction, institutionName, institutionCategory, s1,  s2_a1,  s2_a2,  s2_a3,  s2_b1,  s2_b2,  s2_b3,  s2_c1,  s2_c2,  s2_c3,  s2_d1,  s2_d2,  s2_d3,  s2_e1,  s2_e2,  s2_e3,  s2_f1,  s2_f2,  s2_f3,  s3_a1,  s3_a2,  s3_a3,  s3_a4,  s3_a5,  s3_a6,  s3_a7,  s3_a8,  s3_b1,  s3_b2,  s3_b3,  s3_b4,  s3_b5,  s3_b6,  s3_b7, s3_b8, s3_b9,  s3_b10,  s3_b11,  s3_b12,  s4);
        }

    }
}
