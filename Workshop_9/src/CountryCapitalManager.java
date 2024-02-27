import java.util.HashMap;
import java.util.Map;

public class CountryCapitalManager {
    public static void main(String[] args) {
        // Initialize a HashMap called countryCapitals
        Map<String, String> countryCapitals = new HashMap<>();

        // Add at least five country-capital pairs
        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("Brazil", "Brasília");
        countryCapitals.put("India", "New Delhi");

        // Print all key-value pairs using the printMap method
        printMap(countryCapitals);

        // Test the getCapital method
        String capitalOfIndia = getCapital("India", countryCapitals);
        System.out.println("Capital of India: " + capitalOfIndia);

        // Test the containsCapital method
        boolean containsTokyo = containsCapital("Tokyo", countryCapitals);
        System.out.println("Contains Tokyo: " + containsTokyo);

        // Iterate through the countryCapitals map and print each country and its capital
        System.out.println("\nIterating through the map:");
        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    // Implement a method to print all key-value pairs in a HashMap
    private static void printMap(Map<String, String> map) {
        System.out.println("Printing the map:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    // Implement a method to get the capital of a specific country
    private static String getCapital(String country, Map<String, String> map) {
        return map.get(country);
    }

    // Implement a method to check if a given capital exists in the map
    private static boolean containsCapital(String capital, Map<String, String> map) {
        return map.containsValue(capital);
    }
}
