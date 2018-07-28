package Controller;

import Logic.SectionFour;
import Logic.SectionOne;
import Logic.SectionThree;
import Logic.SectionTwo;
import Model.ApplicantInput;
import Model.ApplicantRecord;

public class ReportBuilder {

    public static ApplicantRecord generateReport(ApplicantInput input){

             return new ApplicantRecord.ApplicantRecordBuilder()
                    .withApplicantInformation(input.getApplicantInfo())
                    .withProfessions(
                            SectionOne.getProfession(input.getProfessionAssessmentInput())
                    ).withSkillScores(
                            SectionTwo.getSkillScore(input.getSkillAssessmentInput())
                    ).withEmotionalQuotient(
                            SectionThree.getEmotionalQuotient(input.getEmotionalAssessmentInput()),
                            SectionThree.getEmotionalQuotientWriteup(SectionThree.getEmotionalQuotient(input.getEmotionalAssessmentInput()))
                    ).withPersonalityAssessment(
                            SectionFour.getPersonalityWriteup(input.getPersonalityAssessmentInput())
                    ).build();
    }

}
