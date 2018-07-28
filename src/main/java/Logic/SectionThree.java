package Logic;

public class SectionThree {
    public static int getEmotionalQuotient(String[] args) {
        int score = 0;

        for (int i = 0; i < 8; i++) {
            if(args[i].equals("N")) {
                score += 1;
            }
        }

        for (int i = 8; i < 20; i++) {
            if(args[i].equals("Y")) {
                score += 1;
            }
        }
        return score;
    }

    public static String getEmotionalQuotientWriteup(int arg) {
        if (arg <= 7) {
            return "You are definitely very uptight. You really do need to allow your emotions flow out a little. There isn't anything really wrong in allowing people to know how you feel.";
        }else if(arg <= 13) {
            return "You know how to let your emotions show but you still find it difficult to do so as often as you should. You should be prepared to let your emotions out more often. When you feel sad let yourself cry, when you feel angry, let your anger show, when you feel happy allow a smile to cross your face. Allowing your emotions out in this way will do wonders to your physical and mental health.";
        }else if(arg <= 20){
            return "Your attitude towards your emotions is a healthy one. You aren't ashamed to let your emotions show occasionally, and you will undoubtedly be much healthier because of this attitude. You will be able to understand others emotions to a reasonable extent, and help them as required.";
        }
        return "error";
    }
}
