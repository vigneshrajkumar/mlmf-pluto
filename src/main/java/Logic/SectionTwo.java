package Logic;

public class SectionTwo {

    public static boolean validate(String[] args) {
        for (String str : args) {
            if(!(str.equals("A") || str.equals("O") || str.equals("R"))) {
                return false;
            }
        }
        return true;
    }

    public static int[] getSkillScore(String[] args) {
        int readingScore = compute(new String[]{args[0], args[1], args[2]});
        int writingScore = compute(new String[]{args[3], args[4], args[5]});
        int studyingScore = compute(new String[]{args[6], args[7], args[8]});
        int memorizingScore = compute(new String[]{args[9], args[10], args[11]});
        int preparingScore = compute(new String[]{args[12], args[13], args[14]});
        int timeManagementScore = compute(new String[]{args[15], args[16], args[17]});

        return new int[]{readingScore, writingScore, studyingScore, memorizingScore, preparingScore, timeManagementScore};
    }

    private static int compute(String[] args){
        int score = 0;
        for (String str : args) {
            if(str.equals("O")) {
                score += 10;
            }else if(str.equals("A")) {
                score += 5;
            }
        }
        return convertToPercent(score, 30);
    }

    // utility function to convert to percentage
    private static int convertToPercent(double x, double y) {
        return (int) (100 * (x / y));
    }
}
