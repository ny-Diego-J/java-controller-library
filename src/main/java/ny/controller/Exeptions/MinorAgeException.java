package ny.controller.Exeptions;

public class MinorAgeException extends RuntimeException {
    public MinorAgeException() {
        super("Noe stop it");
    }
}
