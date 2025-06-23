package collections;

// Importing necessary classes
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetHashSetLinkedHashSet {
    public static void main(String[] args) {

        /*
         * Create a HashSet of Strings.
         * HashSet stores elements in an **unordered** way using a hashing algorithm.
         * It does **not preserve insertion order**.
         */
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("D");

        // Print the contents of the HashSet
        System.out.println("HashSet: " + hashSet);
        // Output order: Could be [A, B, D, C] or any other variation (unordered)

        /*
         * Create a LinkedHashSet of Strings.
         * LinkedHashSet **preserves insertion order**.
         * Internally uses a doubly-linked list along with a hash table.
         */
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("C");
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("D");

        // Print the contents of the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);
        // Output order: Always [C, A, B, D] (as inserted)
    }
}
