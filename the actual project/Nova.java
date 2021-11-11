import java.util.Scanner;

public class Nova {
    /**
     * A chat bot
     * @param name The bot's name, set to "Nova" by default
     * @param personality A number relating to the personality type of the bot
     * @param skipKey The key (character) used to print all the output at once until the next section
     * @param skip Whether or not the bot is set to output everything at once
     * @param alwaysSkip Whether or not the bot is set to always output everything at once
    */

    private String name="Nova";
    private int personality;
    private char skipKey;
    private boolean skip = false;
    private boolean alwaysSkip = false;

    private Scanner input = new Scanner(System.in);
    private String userAnswer;

    // TODO: Maybe do this documentation better?
    /**
     * Contructor for Nova with a specified name, personality type, and skip key
     * @param n Name for the bot, specified by the user (String)
     * @param p Personality
     * @param s Key (character) to be used to print all output until last message at once
     */

    public Nova(String n, int p, char s) {
        name = n;
        personality = p;
    }

    /**
     * Constructor for Nova with the default name of "Nova," a personality type, and a skip key
     * @param p Personality type
     * @param s Key (character) to be used to print all output until last message at once
     */
    public Nova(int p, char s) {
        personality = p;
        skipKey = s;
    }

    /**
     * Used to get the name of the bot
     * @return Returns the name of the bot
     */
    public String getName() {
        return name;
    }

    /**
     * Used to rename the bot
     * @param n What to change the bot's name to
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * Used to print out the personality of the bot
     * @return A description personality of the bot
     */
    public String getPersonality() {
        
        // TODO: Return a personality type for the bot depending the number
        switch (personality) {
            case 1:
            return this.name + " has a \"Smart\" personality.";

            case 2:
            return this.name + " has a \"Timid\" personality.";

            case 3:
            return this.name + " has a \"Chaotic\" personality.";

            // TODO: implement chaos meter for chaotic personalities?

            default:
            return this.name + " does not have a valid personality type. Please go to the main menu, and visit the settings to change their personality type.";
        }
    }

    /**
     * Used to change the bot's personality
     * @param p The personality
     */
    public void setPersonality(int p) {
        personality = p;
    }

    // TODO: Add documentation
    public char getSkipKey() {
        return skipKey;
    }

    // TODO: Add documentation
    public void setSkipKey(char s) {
        skipKey = s;
    }

    public void intro() {
        System.out.println("Hello, I'm " + this.name + "!");
    }

    /**
     * Print out text that is sent to it
     * @param m Message to output
     * @param last (Optional) Whether or not this is the last message to output this time
     */
    public void say(String m, boolean last) {
        System.out.print(m);
        if (!last) {
            System.out.print("... ");
        } else {
            skip = false;
        }
        if (!skip) {
            userAnswer = input.nextLine();
            if (userAnswer.length()==1 && userAnswer.charAt(0)==skipKey) {
                skip = true;
            }
        }
    }

    /**
     * Print out text that is sent to it
     * @param m Message to output
     */
    public void say(String m) {
        System.out.print(m + "... ");

        if (!skip) {
            userAnswer = input.nextLine();
            if (userAnswer.length()==1 && userAnswer.charAt(0)==skipKey) {
                skip = true;
            }
        }
    }
}