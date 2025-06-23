package collections;

import java.util.HashMap;
import java.util.Map;

public class MapHashMap {

    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<Integer, String>();

        names.put(1, "thiru");       // Normal entry
        names.put(2, "thiru");       // Same value, different key
        names.put(3, "susmi");       // Another normal value
        names.put(4, null);          // Null value
        names.put(5, "poovi");       // Unique value
        names.put(6, "poovi");       // Repeated value
        names.put(null, "kanivu");   // Null key
        names.put(7, null);          // Another null value
        names.put(null, "megha");    // Overwrites previous null key
        names.put(1, "vicky");       // Overwrites value for existing key

        // ✅ For-each loop to print all key-value pairs
        for (Map.Entry<Integer, String> entry : names.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
