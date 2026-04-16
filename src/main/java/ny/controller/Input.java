package ny.controller;

import ny.Controller;
import ny.controller.Exeptions.InvalidConsoleException;
import ny.controller.Exeptions.MinorAgeException;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Input {
    private final Scanner sc = new Scanner(System.in);
    private final Print print = new Print();

    /**
     * Gets String input and returns it
     *
     * @param prompt prompt to print bevor input is taken
     * @return String that got inputted by user
     */
    public String readString(String prompt) {
        print.print(prompt);
        return sc.nextLine();
    }


    /**
     * Gets String input and returns it
     *
     * @return String that got inputted by user
     */
    public String readString() {
        return sc.nextLine();
    }


    /**
     * Reads a string and checks if it has a specific lenght
     * @param lenght lenght of input
     * @return input with configured length
     */
    public String readLengthString(int lenght) {
        while (true) {
            try {
                String input = sc.nextLine();
                if (input.length() == lenght) {
                    return input;
                } else throw new MinorAgeException();
            } catch (MinorAgeException e) {
                Controller.Print.printError("This isn't a valid option");
            }
        }
    }

    /**
     * Reads a string and checks if it has a specific lenght
     * @param prompt prompt to print bevor input is taken
     * @param lenght lenght of input
     * @return input with configured length
     */
    public String readLengthString(int lenght, String prompt) {
        while (true) {
            try {
                Controller.Print.print(prompt);
                String input = sc.nextLine();
                if (input.length() == lenght) {
                    return input;
                } else throw new MinorAgeException();
            } catch (MinorAgeException e) {
                Controller.Print.printError("This isn't a valid option");
            }
        }
    }


    /**
     * Reads an input and checks if it is part of a list.
     * @param list list to check
     * @return valid list option
     */
    public String readList(String[] list) {
        while (true) {
            printList(list);
            String input = sc.nextLine();
            for (String s : list) {
                if (input.equalsIgnoreCase(s)) {
                    return s;
                }
            }
            Controller.Print.printError("This isn't a valid option");
        }
    }

    /**
     * Reads an input and checks if it is part of a list.
     * @param prompt Promt to print bevore the input
     * @param list list to check
     * @return valid list option
     */
    public String readList(String prompt, String[] list) {
        while (true) {
            Controller.Print.print(prompt);
            printList(list);
            String input = sc.nextLine();
            for (String s : list) {
                if (input.equalsIgnoreCase(s)) {
                    return s;
                }
            }
            Controller.Print.printError("This isn't a valid option");
        }
    }


    private void printList(String[] list) {
        Controller.Print.print("(");
        for (int i = 0; i < list.length; i++) {
            if (i == list.length -1) {
                Controller.Print.print(list[i]);
            } else {
                Controller.Print.print(list[i] + ", ");
            }
        }
        Controller.Print.print("): ");
    }

    /**
     * reads in a hidden password
     * @return password string
     */
    public String readPassword() {
        try {
            char[] string = System.console().readPassword();
            StringBuilder sb = new StringBuilder();
            for (char c : string) {
                sb.append(c);
            }
            return sb.toString();
        } catch (NullPointerException e) {
            print.printError("You can't use this command in the IDE");
            throw new InvalidConsoleException();
        }
    }

    /**
     * reads in a hidden password
     * @param prompt prompt to print bevor the input is taken
     * @return password string
     */
    public String readPassword(String prompt) {
        try {
            print.print(prompt);
            char[] string = System.console().readPassword();
            StringBuilder sb = new StringBuilder();
            for (char c : string) {
                sb.append(c);
            }
            return sb.toString();
        } catch (NullPointerException e) {
            print.printError("\nYou can't use this command in the IDE");
            throw new InvalidConsoleException();
        }
    }

    /**
     * Gets string and returns it if is valid. If not it repeats the process
     * @return valid mail
     */
    public String readEmail() {
        while (true) {
            boolean isValid = true;
            String input = sc.nextLine();

            String[] atParts = input.split("@", 2);
            if (atParts.length != 2) {
                print.printError("Invalid email: no @ found!");
                isValid = false;
            }

            String first = atParts[0];
            String last = atParts[1];

            if (first.isEmpty()) {
                print.printError("invalid mail!");
                isValid = false;
            }

            String[] dotParts = last.split("\\.", 2);
            if (dotParts.length != 2) {
                print.printError("Ungültig: no domain ending!");
                isValid = false;
            }

            if (dotParts[0].isEmpty()) {
                print.printError("Invalid domain!");
                isValid = false;
            }

            if (dotParts[1].isEmpty() || dotParts[1].length() > 3) {
                print.printError("Invalid length!");
                isValid = false;
            }
            if (isValid) return input;
        }
    }

    /**
     * Gets string and returns it if is valid. If not it repeats the process
     * @param prompt prompt to print bevor the input is taken
     * @return valid mail
     */
    public String readEmail(String prompt) {
        while (true) {
            boolean isValid = true;
            print.print(prompt);
            String input = sc.nextLine();
            String[] atParts = input.split("@", 2);
            if (atParts.length != 2) {
                print.printError("Invalid email: no @ found!");
                isValid = false;
            }

            String first = atParts[0];
            String last = atParts[1];

            if (first.isEmpty()) {
                print.printError("invalid mail!");
                isValid = false;
            }

            String[] dotParts = last.split("\\.", 2);
            if (dotParts.length != 2) {
                print.printError("Ungültig: no domain ending!");
                isValid = false;
            }

            if (dotParts[0].isEmpty()) {
                print.printError("Invalid domain!");
                isValid = false;
            }

            if (dotParts[1].isEmpty() || dotParts[1].length() > 3) {
                print.printError("Invalid length!");
                isValid = false;
            }
            if (isValid) return input;
        }
    }

    /**
     * reads a date and validates if it's true. If so it returns the Date
     * It uses the default format dd.mm.yyyy. it always prints the current format
     * bevor it taks the input.
     * @return valid LocalDate
     */
    public LocalDate readDate() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        while (true) {
            try {
                print.print("(dd.mm.yyyy): ");
                String input = sc.nextLine();
                return LocalDate.parse(input, format);
            } catch (DateTimeParseException e) {
                print.printError("Enter a valid number!");
            }
        }
    }

    /**
     * reads a date and validates if it's true. If so it returns the Date
     * It uses the default format dd.mm.yyyy.
     * @param prompt promt to print bevor input is taken
     * @return valid LocalDate
     */
    public LocalDate readDate(String prompt) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        while (true) {
            try {
                System.out.print(prompt + "(dd.mm.yyyy): ");
                String input = sc.nextLine();
                return LocalDate.parse(input, format);
            } catch (DateTimeParseException e) {
                print.printError("Enter a valid number!");
            }
        }
    }

    /**
     * reads a date and validates if it's true. If so it returns the Date
     * It uses the default format dd.mm.yyyy.
     * @param prompt promt to print bevor input is taken
     * @param formatting format of the input
     * @return valid LocalDate
     */
    public LocalDate readDate(String prompt, String formatting) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern(formatting);
        while (true) {
            try {
                System.out.print(prompt + "(" + formatting + "): ");
                String input = sc.nextLine();
                return LocalDate.parse(input, format);
            } catch (DateTimeParseException e) {
                print.printError("Enter a valid number!");
            }
        }
    }

    /**
     * Reads input until the input is a valid Integer. If one String is attached
     * it uses it as a prompt to print in front of the input. When a second
     * String is attached the content gets printed when the intput isn't valid.
     *
     * @return inputted int
     */
    public int readInt() {
        while (true) {
            String s = sc.nextLine();
            try {
                return Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
                print.printError("Enter a valid number!");
            }
        }
    }

    /**
     * Reads input until the input a valid Integer. If one String is attached
     * it uses it as a prompt to print in front of the input. When a second
     * String is attached the content gets printed when the intput isn't valid.
     *
     * @param prompt prompt to be printed out bevor the intput field
     * @return inputted int
     */
    public int readInt(String prompt) {
        while (true) {
            print.print(prompt);
            String s = sc.nextLine();
            try {
                return Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
                print.printError("Enter a valid number!");
            }
        }
    }

    /**
     * Reads input until the input a valid Integer. If one String is attached
     * it uses it as a prompt to print in front of the input. When a second
     * String is attached the content gets printed when the intput isn't valid.
     *
     * @param min Minimum number that can be returned
     * @param max Maximum number that can be returned
     * @return integer that user has inputted
     */
    public int readInt(int min, int max) {
        while (true) {
            try {
                return getInt(min, max);
            } catch (NumberFormatException e) {
                print.printError("Enter a valid number!");
            }
        }
    }

    /**
     * Reads input until the input a valid Integer. If one String is attached
     * it uses it as a prompt to print in front of the input. When a second
     * String is attached the content gets printed when the intput isn't valid.
     *
     * @param prompt Prompt to print before the input is taken
     * @param min    Minimum number that can be returned
     * @param max    Maximum number that can be returned
     * @return integer that user has inputted
     */
    public int readInt(String prompt, int min, int max) {
        while (true) {
            print.print(prompt);
            try {
                return getInt(min, max);
            } catch (NumberFormatException e) {
                print.printError("Enter a valid number!");
            }
        }
    }

    private int getInt(int min, int max) {
        String s = sc.nextLine();
        int i = Integer.parseInt(s.trim());
        if (i >= min && i <= max) {
            return i;
        } else throw new NumberFormatException();
    }

    /**
     * Reads input until the input a valid Integer. If one String is attached
     * it uses it as a prompt to print in front of the input. When a second
     * String is attached the content gets printed when the intput isn't valid.
     *
     * @param prompt Prompt to print before the input is taken
     * @param error  Error that gets printed if the input is invalid
     * @param min    Minimum number that can be returned
     * @param max    Maximum number that can be returned
     * @return integer that user has inputted
     */
    public int readInt(String prompt, String error, int min, int max) {
        while (true) {
            print.print(prompt);
            try {
                return getInt(min, max);
            } catch (NumberFormatException e) {
                print.printError(error);
            }
        }
    }

    /**
     * Reads input until the input is valid Integer. If one String is attached
     * it uses it as a prompt to print in front of the input. When a second
     * String is attached the content gets printed when the intput isn't valid.
     *
     * @param prompt prompt to be printed out bevor the intput field
     * @param error  The string that gets printed if the input isn't valid for an Integer
     * @return inputted int
     */
    public int readInt(String prompt, String error) {
        while (true) {
            print.print(prompt);
            String s = sc.nextLine();
            try {
                return Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
                print.printError(error);
            }
        }
    }

    /**
     * Reads input and trys to return a Double until the input is valid. If one String is attached
     * it uses it as a prompt to print in front of the input. When a second
     * String is attached the content gets printed when the intput isn't valid.
     *
     * @return inputted Double
     */
    public Double readDouble() {
        while (true) {
            String s = sc.nextLine();
            try {
                return Double.parseDouble(s.trim());
            } catch (NumberFormatException e) {
                print.printError("Enter a valid number!");
            }
        }
    }

    /**
     * Reads input and trys to return a Double until the input is valid. If one String is attached
     * it uses it as a prompt to print in front of the input. When a second
     * String is attached the content gets printed when the intput isn't valid.
     *
     * @param prompt prompt to be printed out bevor the intput field
     * @return inputted Double
     */
    public Double readDouble(String prompt) {
        while (true) {
            print.print(prompt);
            String s = sc.nextLine();
            try {
                return Double.parseDouble(s.trim());
            } catch (NumberFormatException e) {
                print.printError("Enter a valid number!");
            }
        }
    }

    /**
     * Reads input and trys to return a Double until the input is valid. If one String is attached
     * it uses it as a prompt to print in front of the input. When a second
     * String is attached the content gets printed when the intput isn't valid.
     *
     * @param prompt prompt to be printed out bevor the intput field
     * @param error  The string that gets printed if the input isn't valid for a Double
     * @return inputted Double
     */

    public double readDouble(String prompt, String error) {
        while (true) {
            print.print(prompt);
            String s = sc.nextLine();
            try {
                return Double.parseDouble(s.trim());
            } catch (NumberFormatException e) {
                print.printError(error);
            }
        }
    }


    /**
     * Reads input and trys to return a Float until the input is valid. If one String is attached
     * it uses it as a prompt to print in front of the input. When a second
     * String is attached the content gets printed when the intput isn't valid.
     *
     * @return inputted Double
     */

    public float readFloat() {
        while (true) {
            String s = sc.nextLine();
            try {
                return Float.parseFloat(s.trim());
            } catch (NumberFormatException e) {
                print.printError("Enter a valid number!");
            }
        }
    }

    /**
     * Reads input and trys to return a Float until the input is valid. If one String is attached
     * it uses it as a prompt to print in front of the input. When a second
     * String is attached the content gets printed when the intput isn't valid.
     *
     * @param prompt prompt to be printed out bevor the intput field
     * @return inputted Double
     */

    public float readFloat(String prompt) {
        while (true) {
            print.print(prompt);
            String s = sc.nextLine();
            try {
                return Float.parseFloat(s.trim());
            } catch (NumberFormatException e) {
                print.printError("Enter a valid number!");
            }
        }
    }


    /**
     * Reads input and trys to return a Float until the input is valid. If one String is attached
     * it uses it as a prompt to print in front of the input. When a second
     * String is attached the content gets printed when the intput isn't valid.
     *
     * @param prompt prompt to be printed out bevor the intput field
     * @param error  The string that gets printed if the input isn't valid for a Double
     * @return inputted Double
     */

    public float readFloat(String prompt, String error) {
        while (true) {
            print.print(prompt);
            String s = sc.nextLine();
            try {
                return Float.parseFloat(s.trim());
            } catch (NumberFormatException e) {
                print.printError(error);
            }
        }
    }

    /**
     * Reads input and trys to return a valid Boolean until the input is valid. If one String is attached
     * it uses it as a prompt to print in front of the input. When a second
     * String is attached the content gets printed when the intput isn't valid.
     *
     * @return inputted boolean
     */
    public boolean readBoolean() {
        while (true) {
            try {
                return getBoolean();
            } catch (IllegalArgumentException e) {
                print.printError("Enter a valid number!");
            }
        }
    }

    /**
     * Reads input and trys to return a valid Boolean until the input is valid. If one String is attached
     * it uses it as a prompt to print in front of the input. When a second
     * String is attached the content gets printed when the intput isn't valid.
     *
     * @param prompt prompt to be printed out bevor the intput field
     * @return inputted boolean
     */
    public boolean readBoolean(String prompt) {
        while (true) {
            print.print(prompt);
            try {
                return getBoolean();
            } catch (IllegalArgumentException e) {
                print.printError("Enter a valid number!");
            }
        }
    }

    /**
     * Reads input and trys to return a valid Boolean until the input is valid. If one String is attached
     * it uses it as a prompt to print in front of the input. When a second
     * String is attached the content gets printed when the intput isn't valid.
     *
     * @param prompt prompt to be printed out bevor the intput field
     * @param error  The string that gets printed if the input isn't valid for a boolean
     * @return inputted boolean
     */
    public boolean readBoolean(String prompt, String error) {
        while (true) {
            print.print(prompt);
            try {
                return getBoolean();
            } catch (IllegalArgumentException e) {
                print.printError(error);
            }
        }
    }

    /**
     * checks if the value ist valid for a boolean
     * @return if the input is true or false
     */
    private boolean getBoolean() {
        String s = sc.nextLine().trim().toLowerCase();
        return switch (s.toLowerCase()) {
            case "y", "yes", "true", "1", "positive" -> true;
            case "n", "no", "false", "0", "negative" -> false;
            default -> throw new IllegalArgumentException();
        };
    }
}
