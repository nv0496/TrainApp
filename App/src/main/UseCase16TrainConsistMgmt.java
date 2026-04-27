package main;

public class UseCase16TrainConsistMgmt {

    /**
     * Sorts an array of bogie capacities in ascending order using Bubble Sort.
     */
    public void sortCapacities(int[] capacities) {
        int n = capacities.length;
        boolean swapped;

        // Outer loop controls how many passes we make
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop does the actual side-by-side comparisons
            for (int j = 0; j < n - i - 1; j++) {

                // If the left number is bigger than the right number, swap them!
                if (capacities[j] > capacities[j + 1]) {

                    // Temporary variable to hold the value during the swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // If we didn't make any swaps on this pass, the array is fully sorted
            if (!swapped) {
                break;
            }
        }
    }
}