package Logic;

public class SectionTwo {

    public static int getSkillScore(String[] args) {
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
