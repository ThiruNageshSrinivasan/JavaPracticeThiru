// Package declaration - this class is part of the 'collections' package
package collections;

// Importing required classes from java.util
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Class declaration
public class MapLinkedHashMap {

	public static void main(String[] args) {

		/*
		 * Creating a LinkedHashMap called 'names' to store Integer keys and String values.
		 * LinkedHashMap:
		 * - Maintains insertion order (unlike HashMap).
		 * - Allows one null key and multiple null values.
		 */
		Map<Integer, String> names = new LinkedHashMap<Integer, String>();

		// Adding entries to the map
		names.put(1, "thiru");       // Normal key-value pair
		names.put(2, "thiru");       // Same value as key 1, different key
		names.put(3, "susmi");       // Another unique value
		names.put(4, null);          // Null value allowed
		names.put(5, "poovi");       // Unique value
		names.put(6, "poovi");       // Same value as key 5
		names.put(null, "kanivu");   // Null key - allowed once
		names.put(7, null);          // Another null value - allowed
		names.put(null, "megha");    // Overwrites previous null key (kanivu → megha)
		names.put(1, "vicky");       // Overwrites value for existing key 1 (thiru → vicky)

		/*
		 * Using a for-each loop to iterate over the entry set of the map.
		 * entrySet() returns a Set of Map.Entry objects (each one has a key and a value).
		 * Prints each key-value pair in the same order they were inserted (except overwritten keys).
		 */
		for (Map.Entry<Integer, String> entry : names.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}


