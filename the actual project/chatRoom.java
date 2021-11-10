import java.util.Scanner;

// Might use to save data to a file. Not exactly sure of usage, though. JSON, maybe?
import java.io.PrintWriter;

public class chatRoom {
    public static void main(String[] args) {
        // Create Nova the chat bot
        Nova Nova = new Nova(1, 's');

        // Scanner for all user input
        Scanner input = new Scanner(System.in);

        // String to hold user responses
        String userAnswer;
        
        Nova.intro();

        Nova.print("This a test");


        
        // TODO: Have user create a Nova
        
        System.out.print("Enter 'S' for settings.");
        userAnswer = input.nextLine();

        switch (userAnswer.charAt(0)) {
            case 'S':
                novaSettings();
            default:

        }

        input.close();
    }

    // TODO: Maybe move the conversation flow here

    // Method to define settings for Nova
    public static void novaSettings() {

    }
}