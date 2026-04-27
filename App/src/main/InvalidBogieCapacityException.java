package main;

/**
 * A custom exception to handle invalid (negative) bogie capacities.
 */
public class InvalidBogieCapacityException extends Exception {

    public InvalidBogieCapacityException(String message) {
        super(message);
    }
}