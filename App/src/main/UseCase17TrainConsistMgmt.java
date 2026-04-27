package main;

import java.util.Arrays;

public class UseCase17TrainConsistMgmt {

    /**
     * Sorts an array of bogie names alphabetically using Java's built-in Arrays.sort().
     * Includes a safety check to prevent crashes if a null array is passed.
     */
    public void sortBogieNames(String[] names) {

        // Safety Shield: If the array is null, just stop and return early!
        if (names == null) {
            System.out.println("Alert: A null array was passed. Skipping sort to prevent crash.");
            return;
        }

        // If it survives the null check, let Java do the heavy lifting
        Arrays.sort(names);
    }
}