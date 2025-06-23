// Package declaration - this class belongs to the 'collections' package
package collections;

// Importing LinkedHashMap and Map from java.util package
import java.util.LinkedHashMap;
import java.util.Map;

// Class declaration
public class MapLinkedHashMapMerging {

    public static void main(String[] args) {

        /*
         * Creating the first LinkedHashMap named 'mp1'
         * LinkedHashMap stores key-value pairs and maintains the insertion order.
         */
        Map<Integer, Integer> mp1 = new LinkedHashMap<Integer, Integer>();

        // Adding 10 entries to mp1
        mp1.put(1, 11);
        mp1.put(2, 12);
        mp1.put(3, 13);
        mp1.put(4, 14);
        mp1.put(5, 15);
        mp1.put(6, 16);
        mp1.put(7, 17);
        mp1.put(8, 18);
        mp1.put(9, 19);
        mp1.put(10, 20);

        /*
         * Creating another LinkedHashMap named 'mp2'
         * It also contains the same keys and values as mp1 initially.
         */
        Map<Integer, Integer> mp2 = new LinkedHashMap<Integer, Integer>();
        mp2.put(1, 11);
        mp2.put(2, 12);
        mp2.put(3, 13);
        mp2.put(4, 14);
        mp2.put(5, 15);
        mp2.put(6, 16);
        mp2.put(7, 17);
        mp2.put(8, 18);
        mp2.put(9, 19);
        mp2.put(10, 20);

        /*
         * Overwriting the value for key 1 in mp2.
         * This will replace the existing value for key 1 in mp1 when merged.
         */
        mp2.put(1, 88);

        /*
         * Merging mp2 into mp1 using putAll().
         * All key-value pairs from mp2 are copied into mp1.
         * If a key already exists, its value is overwritten.
         */
        mp1.putAll(mp2);

        /*
         * Using a for-each loop to iterate through mp1 using entrySet().
         * This allows access to both keys and values.
         * LinkedHashMap maintains insertion order.
         */
        for (Map.Entry<Integer, Integer> entry : mp1.entrySet()) {
            // Printing each key-value pair
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
