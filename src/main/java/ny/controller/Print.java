package ny.controller;

public class Print {

    public void printError(String text) {
        System.out.println(Color.RED + text + Color.RESET);
    }

    public void printInfo(String text) {
        System.out.println(Color.GREEN + text + Color.RESET);
    }

    public void printColor(String text, Color c) {
        System.out.println(c + text + Color.RESET);
    }
}