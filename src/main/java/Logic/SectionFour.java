package Logic;

public class SectionFour {

    public static boolean validate(String option) {

        if(option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4") || option.equals("5") || option.equals("6") || option.equals("7") || option.equals("8") || option.equals("9")) {
            return true;
        }
        return false;
    }

    public static String getPersonalityWriteup(int option) {

        switch (option) {
            case 1: return "Carefree playful cheerful\nYou love a free and as-you-like-it life. And you try to enjoy it to the fullest, agreeing with the motto: \"You only live once.\" You are very interested in new things and you like change, because you are able to develop yourself when changes happen. You don’t like to be tied down or restricted and nothing is as worse as that for you. You find everything interesting in your environment.";
            case 2: return "Independent original free\nYou like a free and independent life for yourself since it will help you to plan your own course. You can be artistic or creative in your work or leisure activities (hobbies). Your desire or want for freedom sometimes makes you to do the exact opposite of what is expected of you. Your lifestyle can be very original and different from others. You don’t like to blindly do what others are doing. And you like to live according to your own ideas and beliefs, even if you don’t agree with everyone.";
            case 3: return "Introspective sensitive reflective\nYou understand yourself and your environment very well compared to others. You don’t like to talk to people just because you have to; you would rather be alone instead of speaking to others without any reason. Your relationships with your friends are very strong, and it gives you a lot of happiness and peace that you want. You do not mind being alone for long durations, and you don’t get bored when you do that.";
            case 4: return "Down to earth well-balanced harmonious\nYou give importance to a natural style and you like simple things. People like you because you are sure about things and that they can depend on you. Those who are close to you feel safe with you and you give them freedom. You are seen as a kind person. You don’t like showing-off and silly behaviour. You are not very interested in wearing clothes that are in fashion but it has to be comfortable and neat.";
            case 5: return "Professional practical confident\nYou take responsibility for your life, and don’t depend on luck for things to happen. You look at problems practically and solve them easily. You look at life in a real and true manner and handle everything without any difficulty. People know that they can be depend upon and give you important work also. Your strong focus to finish tasks that are given to you makes others understand you as a confident person. You are never fully satisfied until you have completed the things you want to do.";
            case 6: return "Peaceful careful gentle\nYou are easy-going yet careful. You make friends easily, yet you enjoy your privacy and independence. You like to get away from things and be alone from time to time, to think about the meaning of life and enjoy yourself. You like to go alone to places that you like, when you want to, but you like to spend time with people also. You are at peace with yourself and the world, and you appreciate life and what this world has to offer.";
            case 7: return "Analytical trustworthy confident\nYou are able to understand situations very well compared to others and it is your strength. That also makes you like to spend time with people who are ignored by others. Your style is tasteful and different from others. Being decent is important for you. You like clean fun and so you expect that from the people you interact with also.";
            case 8: return "Romantic dreamy emotional\nYou are a very sensitive person and you look at things in an emotional manner. What your feelings tell you is just as important to you. In fact, you feel it is important to have dreams in life. You stay away from people who don’t like romantic and emotional things. And you won’t allow your many moods and emotions to be blocked.";
            case 9: return "Dynamic active extroverted\nYou are quite willing to take risks and boldly do different types of things. You find that interesting and you don’t like routine things because it is boring for you. What you like most is to be able to play an active role in events. In doing so, your creativity comes out. You are an energetic and happy person who enjoys spending time with others.";
            default: return "error";
        }
    }
}
