package fred;

public class EmptyInputException extends FredException {
    public EmptyInputException() {
        super("OOPS!!! I think you forgot to type something.");
    }

}
