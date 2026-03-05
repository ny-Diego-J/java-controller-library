package ny.controller;

public class Print {

    public void printErrorln(String text) {
        System.out.println(Color.RED + text + Color.RESET);
    }

    public void printInfoln(String text) {
        System.out.println(Color.GREEN + text + Color.RESET);
    }

    public void printColorln(String text, String color) {
        System.out.println(color + text + Color.RESET);
    }

    public void printClearln(String text) {
        System.out.println("\u001B[10;1m" + text + Color.RESET);
    }

    public void printClear(String text) {
        System.out.print("\u001B[10;1m" + text + Color.RESET);
    }

    public void printErrorln(int text) {
        System.out.println(Color.RED + text + Color.RESET);
    }

    public void printInfoln(int text) {
        System.out.println(Color.GREEN + text + Color.RESET);
    }

    public void printColorln(int text, String color) {
        System.out.println(color + text + Color.RESET);
    }

    public void printClearln(int text) {
        System.out.println("\u001B[10;1m" + text + Color.RESET);
    }
}