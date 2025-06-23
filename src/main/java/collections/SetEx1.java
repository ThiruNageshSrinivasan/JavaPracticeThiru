// Package declaration - this class belongs to the 'collections' package
package collections;

// Import HashSet and Set from java.util
import java.util.HashSet;
import java.util.Set;

// Class declaration
public class SetEx1 {

    // Main method - program entry point
    public static void main(String[] args) {

        /*
         * Creating a Set of Integer values using HashSet.
         * HashSet is a class that implements Set interface.
         * It does not allow duplicate values.
         * It also does not maintain insertion order.
         */
        Set<Integer> s1 = new HashSet<Integer>();

        // Adding multiple values to the Set
        s1.add(1); // Added
        s1.add(1); // Ignored (duplicate)
        s1.add(1); // Ignored
        s1.add(1); // Ignored
        s1.add(1); // Ignored
        s1.add(1); // Ignored
        s1.add(1); // Ignored
        s1.add(1); // Ignored
        s1.add(2); // Added
        s1.add(3); // Added

        /*
         * Using enhanced for loop to print all unique elements in the set.
         * The order may not be the same as insertion because HashSet is unordered.
         */
        for (Integer x : s1) {
            System.out.println(x); // Output will be: 1, 2, 3 (order may vary)
        }
    }
}
