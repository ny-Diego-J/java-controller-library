package ny.controller.Exeptions;

public class InvalidConsoleException extends RuntimeException {
    public InvalidConsoleException() {
        super("You can't use this function if you run the programm from the IDE");
    }
}
