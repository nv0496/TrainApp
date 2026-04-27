package main;

import java.util.ArrayList;
import java.util.List;

public class UseCase13TrainConsistMgmt {

    /**
     * Generates a massive list of bogies to make the performance test noticeable.
     */
    public List<String> generateLargeConsist(int size) {
        List<String> consist = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            consist.add("Bogie-" + i);
        }
        return consist;
    }

    /**
     * Counts the bogies using a traditional For-Loop and returns the time taken.
     */
    public long measureForLoopPerformance(List<String> consist) {
        long startTime = System.nanoTime(); // Start Stopwatch

        int count = 0;
        for (String bogie : consist) {
            count++;
        }

        long endTime = System.nanoTime(); // Stop Stopwatch
        return (endTime - startTime);
    }

    /**
     * Counts the bogies using Java Streams and returns the time taken.
     */
    public long measureStreamPerformance(List<String> consist) {
        long startTime = System.nanoTime(); // Start Stopwatch

        long count = consist.stream().count();

        long endTime = System.nanoTime(); // Stop Stopwatch
        return (endTime - startTime);
    }
}