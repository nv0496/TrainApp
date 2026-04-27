package main;

public class UseCase14TrainConsistMgmt {

    /**
     * Validates that a bogie's capacity is a realistic, positive number.
     * Throws an InvalidBogieCapacityException if the capacity is below zero.
     */
    public void validateBogieCapacity(int capacity) throws InvalidBogieCapacityException {

        if (capacity < 0) {
            // Trip the alarm!
            throw new InvalidBogieCapacityException("Validation Failed: Capacity cannot be negative (" + capacity + ").");
        }

        // If it survives the if-statement, it's valid
        System.out.println("Validation Passed: " + capacity + " is a valid seat capacity.");
    }
}