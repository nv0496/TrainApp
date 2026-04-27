package main;

/**
 * A custom exception triggered when a search operation fails to find the requested Bogie.
 */
public class BogieNotFoundException extends Exception {

    public BogieNotFoundException(String message) {
        super(message);
    }
}