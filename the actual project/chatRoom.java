import java.util.InputMismatchException;
import java.util.Scanner;

// Might use to save data to a file. Not exactly sure of usage, though. JSON, maybe?
// import java.io.PrintWriter;

public class chatRoom {

    static Nova Nova;

    // String to hold user responses
    static String userAnswer;

    // Scanner for all user input
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Create Nova the chat bot
        // Nova Nova = new Nova(1, 's');
        
        // Nova.intro();

        // Nova.print("This a test");
        
        // TODO: Have user create a Nova
        
        // System.out.print("Enter 'S' for settings.");
        // userAnswer = input.nextLine();

        // switch (userAnswer.charAt(0)) {
        //     case 'S':
        //         novaSettings();
        //     default:

        // }

        if (Nova == null) {
            convoFlow("We're going to create a new bot.");
            newNova();
        }

        input.close();
    }

    // TODO: Maybe move the conversation flow here

    // Method to define settings for Nova
    public static void novaSettings() {
        
    }

    public static void newNova() {
        String name;
        int personality = 0;
        char skip = '.';

        boolean inputValid = false;
        
        System.out.println("What would you like to call your bot? Hit [Enter] if you just want to stick with the default name of \"Nova\"");
        name = input.nextLine();

        do {
            inputValid = false;
            System.out.println("What would you like its personality to be? Enter...");
            // TODO: Define some personality types
            System.out.println("\"1\" for \"Smart\"");
            System.out.println("\"2\" for \"Timid\"");
            System.out.println("\"3\" for \"Chaotic\"");
            try {
                personality = input.nextInt();

                if (personality < 0) {

                } else if (personality == 0) {

                } else if (personality > 3) {

                } else {
                    do {
                        // System.out.print("You entered " + personality + " for the personality type, which would give you a bot with a " + " personality. Is that okay? (y/N) ");
                        // TODO: Find some way to get which personality type would come from what number (new class for references/help?)

                        confirm("You entered " + personality + " for the personality type, which would give you a bot with a " + " personality. Is that okay?", true);
                        // userAnswer = input.nextLine();
                        // if (userAnswer.charAt(0)=='y' || userAnswer.charAt(0)=='Y') {
                        //     convoFlow("I'll take that as a \"yes.\" Moving on...");
                        //     inputValid = true;
                        // } else if (userAnswer.charAt(0)=='n' || userAnswer.charAt(0)=='N' || userAnswer=="") {
                        //     convoFlow("I'll take that as a \"no.\"");
                        //     break;
                        // } else {

                        // }
                    } while (!inputValid);                    
                }

                // TODO: Confirm user choice
                // TODO: Handle user not entering a valid whole number
            } catch (InputMismatchException e) {
                //TODO: handle user not entering a whole number
                convoFlow("That is either not a whole number, or if it was one, it was too big.");
                input = new Scanner(System.in);
            }
        } while (!inputValid);

        do {
            inputValid = false;
            System.out.println("What character would you like to use to skip through your bot's rambling? (This has to be a character, not just a key. Keys like [Shift] and [Ctrl] won't work)");

            try {
                skip = input.next(".").charAt(0);
                // TODO: Confirm user choice
            } catch (Exception e) {
                input = new Scanner(System.in);
                //TODO: handle exception
            }
        } while (!inputValid);

        if (name==null) {
            Nova = new Nova(personality, skip);
        } else {
            Nova = new Nova(name, personality, skip);
        }
    }

    // TODO: Incorporate color into output (pretty easy on Unix, harder on Windows)
    public static void convoFlow(String m) {
        // Scanner go = new Scanner(System.in);
        String flow;
        System.out.print(m);
        flow = input.nextLine();

        //TODO(?): If the user doesn't press anything within a few seconds, remind them to press enter to continue
    }

    public static void ask(String q) {
        // Scanner flow = new Scanner(System.in);
        // String flow;

    }

    // TODO: finish methods to confirm user answer. One below is strict case.
    public static char confirm(String question, boolean strict) {
        boolean inputValid = false;
        char userConfirm = '.';
        do {
            System.out.print(question);
            if (strict) {
                System.out.print(" (y/n) ");
                userAnswer = input.nextLine();
                if (userAnswer.charAt(0)=='y' || userAnswer.charAt(0)=='Y') {
                    convoFlow("I'll take that as a \"yes.\" Moving on...");
                    userConfirm = 'y';
                    inputValid = true;
                } else if (userAnswer.charAt(0)=='n' || userAnswer.charAt(0)=='N') {
                    convoFlow("I'll take that as a \"no.\"");
                    userConfirm = 'n';
                    inputValid = true;
                } else {
                    convoFlow("I need a \"yes\" or a \"no.\"");
                }
            } else {
                System.out.print(" (y/N) ");
                userAnswer = input.nextLine();
                if (userAnswer.charAt(0)=='y' || userAnswer.charAt(0)=='Y') {
                    convoFlow("I'll take that as a \"yes.\" Moving on...");
                    userConfirm = 'y';
                    inputValid = true;
                } else {
                    convoFlow("I'll take that as a \"no.\"");
                    userConfirm = 'n';
                    inputValid = true;
                }
            }
        } while (!inputValid);
        return userConfirm;
    }

    public static char confirm(String question) {
        boolean inputValid = false;
        char userConfirm = '.';
        do {
            System.out.print(" (y/N) ");
            userAnswer = input.nextLine();
            if (userAnswer.charAt(0)=='y' || userAnswer.charAt(0)=='Y') {
                convoFlow("I'll take that as a \"yes.\" Moving on...");
                userConfirm = 'y';
                inputValid = true;
            } else {
                convoFlow("I'll take that as a \"no.\"");
                userConfirm = 'n';
                inputValid = true;
            }
        } while (!inputValid);
        return userConfirm;
    }
}