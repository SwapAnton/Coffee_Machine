package machine;

public final class DomainException extends RuntimeException{
    public DomainException() {
    }

    public DomainException(String message) {
        super("Error_" + message);
    }
}
