import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

/**
 * MAIN CLASS - TrainApp
 * ------------------------------------------------
 * Use Case 1: Initialize Train and Display Consist Summary
 * Use Case 2: Add Passenger Bogies to Train
 * Use Case 3: Track Unique Bogie IDs (Set - HashSet)
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

        // Create a Set to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add initial unique IDs
        bogieIds.add("BOG-101");
        bogieIds.add("BOG-102");
        bogieIds.add("BOG-103");

        System.out.println("\nBogie IDs Tracked :");
        System.out.println(bogieIds);

        System.out.println("\nNote:");
        System.out.println("Attempted to add duplicate 'BOG-101'.");

        // Attempting to add a duplicate
        bogieIds.add("BOG-101");

        // Displaying the size to prove the duplicate was ignored
        System.out.println("\nSet prevents duplicates, size is: " + bogieIds.size());
    }
}