package ny.controller;


public class Banner { //TODO: add documentation
    private final Input input = new Input();

    public int getBannerChoice(String[] options) {
        printBanner(options);
        return input.readInt("Wähle eine Option: ");

    }

    public int getBannerChoice(String[] options, String prompt) {
        printBanner(options);
        return input.readInt(prompt);

    }

    public void printBanner(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }
}
