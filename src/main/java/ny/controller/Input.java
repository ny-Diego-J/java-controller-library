package ny.controller;

import java.util.Scanner;

public class Input {
    private final Scanner input = new Scanner(System.in);
    private final Print print = new Print();

    /**
     * Gets String input and returns it
     *
     * @param prompt prompt to print bevor input is taken
     * @return String that got inputted by user
     */
    public String readString(String prompt) {
        print.print(prompt);
        return input.nextLine();
    }


    /**
     * Gets String input and returns it
     *
     * @return String that got inputted by user
     */
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
                print.printErrorln("Enter a valid number!");
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
            String s = input.nextLine();
            try {
                return Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
                print.printErrorln("Enter a valid number!");
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
                print.printErrorln("Enter a valid number!");
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
                print.printErrorln("Enter a valid number!");
            }
        }
    }

    private int getInt(int min, int max) {
        String s = input.nextLine();
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
                print.printErrorln(error);
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
            String s = input.nextLine();
            try {
                return Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
                print.printErrorln(error);
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
                print.printErrorln("Enter a valid number!");
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
            String s = input.nextLine();
            try {
                return Double.parseDouble(s.trim());
            } catch (NumberFormatException e) {
                print.printErrorln("Enter a valid number!");
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
            String s = input.nextLine();
            try {
                return Double.parseDouble(s.trim());
            } catch (NumberFormatException e) {
                print.printErrorln(error);
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
                print.printErrorln("Enter a valid number!");
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
            String s = input.nextLine();
            try {
                return Float.parseFloat(s.trim());
            } catch (NumberFormatException e) {
                print.printErrorln("Enter a valid number!");
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
            String s = input.nextLine();
            try {
                return Float.parseFloat(s.trim());
            } catch (NumberFormatException e) {
                print.printErrorln(error);
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
                print.printErrorln("Enter a valid number!");
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
            print.println(prompt);
            try {
                return getBoolean();
            } catch (IllegalArgumentException e) {
                print.printErrorln("Enter a valid number!");
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
            print.println(prompt);
            try {
                return getBoolean();
            } catch (IllegalArgumentException e) {
                print.printErrorln(error);
            }
        }
    }

    private boolean getBoolean() {
        String s = input.nextLine().trim().toLowerCase();
        return switch (s) {
            case "y", "yes", "true", "1" -> true;
            case "n", "no", "false", "0" -> false;
            // Wenn nichts passt, werfen wir eine Exception, die oben gefangen wird
            default -> throw new IllegalArgumentException();
        };
    }
}
