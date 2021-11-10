public class Nova {
    /**
     * A chat bot
     * @param name The bot's name, set to "Nova" by default
     * @param personality A number relating to the personality type of the bot
    */

    private String name="Nova";
    private int personality;

    // TODO: Maybe do this documentation better?
    /**
     * 
     * @param n Name for the bot, specified by the user (String)
     * @param p Personality
     */

    public Nova(String n, int p) {
        name = n;
        personality = p;
    }

    /**
     * Default constructor for Nova
     * @param p
     */
    public Nova(int p) {
        personality = p;
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

            return "";

            default:
            return "";
        }
    }

    /**
     * Used to change the bot's personality
     * @param p
     */
    public void setPersonality(int p) {
        personality = p;
    }
}