package ny.controller;

import java.util.Scanner;

public class Input {
    private final Scanner input = new Scanner(System.in);


    public String readString(String prompt) {
        System.out.print(prompt);
        return input.nextLine();
    }

    public String readString() {
        return input.nextLine();
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
            String s = input.nextLine();
            try {
                return Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number!");
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
            System.out.print(prompt);
            String s = input.nextLine();
            try {
                return Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number!");
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
            System.out.print(prompt);
            String s = input.nextLine();
            try {
                return Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
                System.out.println(error);
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
            String s = input.nextLine();
            try {
                return Double.parseDouble(s.trim());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number!");
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
            System.out.print(prompt);
            String s = input.nextLine();
            try {
                return Double.parseDouble(s.trim());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number!");
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
            System.out.print(prompt);
            String s = input.nextLine();
            try {
                return Double.parseDouble(s.trim());
            } catch (NumberFormatException e) {
                System.out.println(error);
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
            String s = input.nextLine();
            try {
                return Float.parseFloat(s.trim());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number!");
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
            System.out.print(prompt);
            String s = input.nextLine();
            try {
                return Float.parseFloat(s.trim());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number!");
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
            System.out.print(prompt);
            String s = input.nextLine();
            try {
                return Float.parseFloat(s.trim());
            } catch (NumberFormatException e) {
                System.out.println(error);
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
            String s = input.nextLine();
            switch (s.toLowerCase()) {
                case "y", "yes", "true" -> {
                    return true;
                }
                case "n", "false", "no" -> {
                    return false;
                }
                default -> {
                    try {
                        return Boolean.parseBoolean(s);
                    } catch (NumberFormatException e) {
                        System.out.println("Enter a valid value!");
                    }
                }
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
            System.out.println(prompt);
            String s = input.nextLine();
            switch (s.toLowerCase()) {
                case "y", "yes", "true" -> {
                    return true;
                }
                case "n", "false", "no" -> {
                    return false;
                }
                default -> {
                    try {
                        return Boolean.parseBoolean(s);
                    } catch (NumberFormatException e) {
                        System.out.println("Enter a valid value!");
                    }
                }
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
            System.out.println(prompt);
            String s = input.nextLine();
            switch (s.toLowerCase()) {
                case "y", "yes", "true" -> {
                    return true;
                }
                case "n", "false", "no" -> {
                    return false;
                }
                default -> {
                    try {
                        return Boolean.parseBoolean(s);
                    } catch (NumberFormatException e) {
                        System.out.println(error);
                    }
                }
            }
        }
    }
//TODO: add input for other datatypes
//TODO: make a library
}
