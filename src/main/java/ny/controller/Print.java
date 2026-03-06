package ny.controller;

public class Print {

    /**
     * prints the text in red
     *
     * @param text text to get printed
     */
    public void printError(String text) {
        System.out.println(Color.RED + text + Color.RESET);
    }

    /**
     * Pirnts the text in green
     *
     * @param text text to ger printed
     */
    public void printInfoln(String text) {
        System.out.println(Color.GREEN + text + Color.RESET);
    }

    /**
     * Pirnts the text in green
     *
     * @param text text to ger printed
     */
    public void printInfoln(int text) {
        System.out.println(Color.GREEN + text + Color.RESET);
    }

    /**
     * prints the text in a custom color
     *
     * @param text  text to get printed
     * @param color color to get printed from the Color class
     */
    public void printColorln(String text, String color) {
        System.out.println(color + text + Color.RESET);
    }

    /**
     * prints the text in a custom color
     *
     * @param text  text to get printed
     * @param color color to get printed from the Color class
     */
    public void printColorln(int text, String color) {
        System.out.println(color + text + Color.RESET);
    }

    /**
     * prints the text in a custom color
     *
     * @param text  text to get printed
     * @param color color to get printed from the Color class
     */
    public void printColor(String text, String color) {
        System.out.print(color + text + Color.RESET);
    }

    /**
     * prints the text in a custom color
     *
     * @param text  text to get printed
     * @param color color to get printed from the Color class
     */
    public void printColor(int text, String color) {
        System.out.print(color + text + Color.RESET);
    }

    /**
     * Prints the text in an clearer format
     *
     * @param text text to print
     */
    public void println(int text) {
        System.out.println("\u001B[10;1m" + text + Color.RESET);
    }

    /**
     * Prints the text in an clearer format
     *
     * @param text text to print
     */
    public void println(String text) {
        System.out.println("\u001B[10;1m" + text + Color.RESET);
    }

    /**
     * Prints the text in an clearer format
     *
     * @param text text to print
     */
    public void print(String text) {
        System.out.print("\u001B[10;1m" + text + Color.RESET);
    }

    /**
     * Prints the text in an clearer format
     *
     * @param text text to print
     */
    public void print(int text) {
        System.out.print("\u001B[10;1m" + text + Color.RESET);
    }
}