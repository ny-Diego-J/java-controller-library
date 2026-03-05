package ny.controller;


public class Banner {
    private final Input input = new Input();
    private final Print print = new Print();

    /**
     * Prints the options and returns the users choice
     *
     * @param options list of options
     * @return user input
     */
    public int getBannerChoice(String[] options) {
        printBanner(options);
        return input.readInt("Wähle eine Option: ");
    }
    /**
     * Prints the options and returns the users choice
     *
     * @param header header to print bevor the list is printed
     * @param options list of options
     * @return user input
     */
    public int getBannerChoice(String header, String[] options) {
        print.printClearln(header);
        printBanner(options);
        return input.readInt("Wähle eine Option: ");
    }

    /**
     * Prints the options and returns the users choice
     *
     * @param options list of options
     * @param prompt  prompt to print bevor the input is taken
     * @return user input
     */
    public int getBannerChoice(String[] options, String prompt) {
        printBanner(options);
        return input.readInt(prompt);
    }
    /**
     * Prints the options and returns the users choice
     *
     * @param title Title to print bevor the list
     * @param options list of options
     * @param prompt  prompt to print bevor the input is taken
     * @return user input
     */
    public int getBannerChoice(String title, String[] options, String prompt) {
        print.printClearln(title);
        printBanner(options);
        return input.readInt(prompt);
    }

    /**
     * Prints the given list with corresponding numbers
     *
     * @param options list of entries
     */
    public void printBanner(String[] options) {
        for (int i = 0; i < options.length; i++) {
            print.printClearln((i + 1) + ". " + options[i]);
        }
    }
}
