package main;

import java.util.List;

public class UseCase10TrainConsistMgmt {

    // Helper class to represent a Bogie with a specific seating capacity
    public static class Bogie {
        private String type;
        private int capacity;

        public Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    /**
     * Calculates the total capacity of all bogies in the consist
     * using the Java Streams API and Reduce.
     */
    public int countTotalSeats(List<Bogie> consist) {
        // Stream through the list, map each bogie to its integer capacity, and add them up
        return consist.stream()
                .map(bogie -> bogie.getCapacity())
                .reduce(0, Integer::sum);
    }
}