import java.util.Scanner;

// Might use to save data to a file. Not exactly sure of usage, though. JSON, maybe?
import java.io.PrintWriter;

public class chatRoom {
    public static void main(String[] args) {
        // Create Nova the chat bot
        Nova Nova;

        // Scanner for all user input
        Scanner input = new Scanner(System.in);

        // String to hold user responses
        String userAnswer;
        
        System.out.println("Hello, I'm Nova!");
        
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

    // Method to define settings for Nova
    public static void novaSettings() {

    }
}