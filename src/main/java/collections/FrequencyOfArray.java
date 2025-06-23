// Package declaration - this class is part of the 'collections' package
package collections;

// Importing necessary classes
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfArray {

    public static void main(String[] args) {

        /*
         * Step 1: Declare and initialize an integer array 'a'
         * It contains repeated values, and we want to count how many times each number appears.
         */
        int[] a = {30, 10, 10, 30, 20, 10, 20, 20};

        /*
         * Step 2: Get the length of the array
         */
        int b = a.length;

        /*
         * Step 3: Create a LinkedHashMap to store number → frequency mapping
         * LinkedHashMap is used to maintain insertion order
         */
        Map<Integer, Integer> s1 = new LinkedHashMap<Integer, Integer>();

        /*
         * Step 4: Loop through the array
         * For each element:
         *  - If it's already in the map, increment its count
         *  - If it's not in the map, add it with count 1
         */
        for (int i = 0; i < b; i++) {  // FIXED: changed from i <= b to i < b (to avoid ArrayIndexOutOfBounds)
            if (s1.containsKey(a[i])) {  // FIXED: added closing parenthesis
                s1.put(a[i], s1.get(a[i]) + 1);  // Increment existing count
            } else {
                s1.put(a[i], 1);  // First time seen, set frequency to 1
            }
        }

        /*
         * Step 5: Print the frequency map
         * Each entry in the map contains a number and its frequency
         */
        System.out.println("Element → Frequency:");
        for (Map.Entry<Integer, Integer> entry : s1.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
