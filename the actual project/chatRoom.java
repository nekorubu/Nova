import java.util.Scanner;

// Might use to save data to a file. Not exactly sure of usage, though. JSON, maybe?
// import java.io.PrintWriter;

public class chatRoom {

    static Nova Nova;

    // Scanner for all user input
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Create Nova the chat bot
        // Nova Nova = new Nova(1, 's');

        // String to hold user responses
        String userAnswer;
        
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
            System.out.println("What would you like its personality to be like? Enter...");
            // TODO: Define some personality types
            System.out.println("\"1\" for ");
            try {
                personality = input.nextInt();
                // TODO: Confirm user choice
                // TODO: Handle user not entering a valid whole number
            } catch (Exception e) {
                //TODO: handle user not entering a whole number
                input = new Scanner(System.in);
            }
        } while (!inputValid);

        do {
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

    public static void convoFlow(String m) {
        // Scanner go = new Scanner(System.in);
        String flow;
        System.out.print(m);
        flow = input.nextLine();
    }

    public static void ask(String q) {
        // Scanner flow = new Scanner(System.in);
        // String flow;

    }
}