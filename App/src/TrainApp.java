import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Map;       // New import for UC6
import java.util.HashMap;   // New import for UC6

/**
 * MAIN CLASS - TrainApp
 * ------------------------------------------------
 * Use Case 1: Initialize Train and Display Consist Summary
 * Use Case 2: Add Passenger Bogies to Train
 * Use Case 3: Track Unique Bogie IDs (Set - HashSet)
 * Use Case 4: Maintain Ordered Bogie IDs (TreeSet & SortedSet)
 * Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)
 * Use Case 6: Map Bogie to Capacity (HashMap)
 */
public class TrainApp {

    public static void main(String[] args) {
        // ==========================================
        // USE CASE 1: INITIALIZE TRAIN
        // ==========================================

        System.out.println("=========================================");
        System.out.println("   === Train Consist Management App ===  ");
        System.out.println("=========================================");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);
        System.out.println();
        System.out.println("System ready for operations...");


        // ==========================================
        // USE CASE 2: ADD PASSENGER BOGIES
        // ==========================================

        System.out.println("\n--- UC2: Add Passenger Bogies to Train ---");
        System.out.println("\nAdding Bogies...");

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("Updated Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);


        // ==========================================
        // USE CASE 3: TRACK UNIQUE BOGIE IDs
        // ==========================================

        System.out.println("\n--- UC3: Track Unique Bogie IDs ---");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BOG-101");
        bogieIds.add("BOG-102");
        bogieIds.add("BOG-103");

        System.out.println("\nBogie IDs Tracked :");
        System.out.println(bogieIds);

        System.out.println("\nNote:");
        System.out.println("Attempted to add duplicate 'BOG-101'.");

        bogieIds.add("BOG-101");

        System.out.println("\nSet prevents duplicates, size is: " + bogieIds.size());


        // ==========================================
        // USE CASE 4: MAINTAIN ORDERED BOGIE IDs
        // ==========================================

        System.out.println("\n--- UC4: Maintain Ordered Bogie IDs ---");
        System.out.println("\nAdding Bogie IDs out of order...");
        System.out.println("BOG-104, BOG-101, BOG-105, BOG-102");

        SortedSet<String> sortedBogieIds = new TreeSet<>();

        sortedBogieIds.add("BOG-104");
        sortedBogieIds.add("BOG-101");
        sortedBogieIds.add("BOG-105");
        sortedBogieIds.add("BOG-102");

        System.out.println("\nSorted Bogie IDs (TreeSet) : " + sortedBogieIds);

        System.out.println("\nFirst Bogie ID : " + sortedBogieIds.first());
        System.out.println("Last Bogie ID : " + sortedBogieIds.last());


        // ==========================================
        // USE CASE 5: PRESERVE INSERTION ORDER
        // ==========================================

        System.out.println("\n--- UC5: Preserve Insertion Order of Bogies ---");
        System.out.println("Adding bogies (Engine, Sleeper, AC Chair, Cargo)...");

        Set<String> linkedBogies = new LinkedHashSet<>();

        linkedBogies.add("Engine");
        linkedBogies.add("Sleeper");
        linkedBogies.add("AC Chair");
        linkedBogies.add("Cargo");

        System.out.println("\nTrain Consist (Insertion Order) :");
        System.out.println(linkedBogies);

        System.out.println("\nNote: Attempted to add duplicate Engine. Order remains unchanged.");

        linkedBogies.add("Engine");

        System.out.println("\nAll items processed in order.");


        // ==========================================
        // USE CASE 6: MAP BOGIE TO CAPACITY
        // ==========================================

        System.out.println("\n--- UC6: Map Bogie to Capacity (HashMap) ---");

        // 1. Create a HashMap to map String (Bogie Type) to Integer (Capacity)
        Map<String, Integer> bogieCapacities = new HashMap<>();

        // 2. Map capacities to corresponding bogies using put()
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 54);
        bogieCapacities.put("Cargo", 120);

        System.out.println("\nBogie Capacities (HashMap):");

        // 3. Iterate through the map using entrySet() to print key-value pairs
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("\nUC6 bogie capacity mapping completed...");
    }
}