package example.chapter7;

public class NoSuchViewResolverException extends RuntimeException {

    public NoSuchViewResolverException() {
        super("No such ViewResolver.");
    }

    public NoSuchViewResolverException(String message) {
        super(message);
    }

}
