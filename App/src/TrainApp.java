import java.util.ArrayList;
import java.util.List;

/**
 * MAIN CLASS - TrainApp
 * ------------------------------------------------
 * Use Case 1: Initialize Train and Display Consist Summary
 * Use Case 2: Add Passenger Bogies to Train
 */
public class TrainApp {

    public static void main(String[] args) {
        // ==========================================
        // USE CASE 1: INITIALIZE TRAIN
        // ==========================================

        // Display welcome banner
        System.out.println("=========================================");
        System.out.println("   === Train Consist Management App ===  ");
        System.out.println("=========================================");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");

        // Display the initial bogie count using size()
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Print the current state of the train
        System.out.println("Current Train Consist : " + trainConsist);

        // Blank line for formatting
        System.out.println();

        // Program continues
        System.out.println("System ready for operations...");


        // ==========================================
        // USE CASE 2: ADD PASSENGER BOGIES
        // ==========================================

        System.out.println("\n--- UC2: Add Passenger Bogies to Train ---");
        System.out.println("\nAdding Bogies...");

        // Add passenger bogies to the list
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // Display the updated bogie count
        System.out.println("Updated Bogie Count : " + trainConsist.size());

        // Print the updated state of the train
        System.out.println("Current Train Consist : " + trainConsist);
    }
}