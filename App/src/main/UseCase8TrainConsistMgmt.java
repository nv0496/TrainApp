package main;

import java.util.Iterator;
import java.util.List;

public class UseCase8TrainConsistMgmt {

    /**
     * This method takes a list of mixed bogies, uses an Iterator to safely
     * remove non-passenger bogies, and returns the filtered list.
     */
    public List<String> filterPassengerBogies(List<String> consist) {
        // Obtain the Iterator
        Iterator<String> iterator = consist.iterator();

        // Loop through and safely remove non-passenger elements
        while (iterator.hasNext()) {
            String currentBogie = iterator.next();

            // Check if the current bogie is a non-passenger type
            if (currentBogie.equals("Engine") || currentBogie.equals("Cargo") || currentBogie.equals("Pantry Car")) {
                // Safe removal using the iterator itself
                iterator.remove();
            }
        }

        return consist; // Return the cleaned-up list
    }
}
