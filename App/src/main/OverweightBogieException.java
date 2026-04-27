package main;

/**
 * A custom exception that acts as a safety alarm when a bogie is too heavy.
 * By extending "Exception", we force the program to acknowledge and handle this risk.
 */
public class OverweightBogieException extends Exception {

    public OverweightBogieException(String message) {
        // Passes our custom error message up to the standard Java Exception system
        super(message);
    }
}