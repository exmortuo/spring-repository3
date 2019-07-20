package pl.dominisz.springintroduction.service;

public class UnreachableException extends RuntimeException {

    public UnreachableException(String message) {
        super(message);
    }
}
