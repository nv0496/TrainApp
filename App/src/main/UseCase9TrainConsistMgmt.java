package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseCase9TrainConsistMgmt {

    // Helper class to represent a Bogie with an ID and a Type
    public static class Bogie {
        private String id;
        private String type;

        public Bogie(String id, String type) {
            this.id = id;
            this.type = type;
        }

        public String getId() { return id; }
        public String getType() { return type; }
    }

    /**
     * Groups a list of bogies by their type using a HashMap.
     */
    public Map<String, List<String>> groupBogiesByType(List<Bogie> consist) {
        // 1. Create a map where the Key is the Bogie Type, and the Value is a List of Bogie IDs
        Map<String, List<String>> groupedBogies = new HashMap<>();

        // 2. Iterate through the incoming list of bogies
        for (Bogie bogie : consist) {

            // 3. If the map doesn't have this bogie type yet, create a new empty list for it
            if (!groupedBogies.containsKey(bogie.getType())) {
                groupedBogies.put(bogie.getType(), new ArrayList<>());
            }

            // 4. Add the specific Bogie ID to the correct Type list
            groupedBogies.get(bogie.getType()).add(bogie.getId());
        }

        return groupedBogies;
    }
}