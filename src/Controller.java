import java.util.Scanner;

public class Controller {
    Scanner input = new Scanner(System.in);

    public String readString(String prompt) {
        System.out.print(prompt);
        return input.nextLine();
    }

    public String readString() {
        return input.nextLine();
    }


    /**
     * Reads input until the input is valid
     *
     * @param prompt
     * @return inputted int
     */
    public int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = input.nextLine();
            try {
                return Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number!");
            }
        }
    }

    public int readInt() {
        while (true) {
            String s = input.nextLine();
            try {
                return Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number!");
            }
        }
    }

    public int readInt(String prompt, String error) {
        while (true) {
            System.out.print(prompt);
            String s = input.nextLine();
            try {
                return Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        }
    }

    //TODO: add system for banners
    //TODO: add doc
    //TODO: make a library
}
