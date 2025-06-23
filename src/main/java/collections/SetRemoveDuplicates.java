// Package declaration - this class is part of the 'collections' package
package collections;

// Importing required classes
import java.util.HashSet;
import java.util.Set;

public class SetRemoveDuplicates {

    public static void main(String[] args) {

        /*
         * Declaring and initializing an integer array 'a' with duplicate values.
         * This array contains repeated numbers like 1, 2, 3, and 4.
         */
        int a[] = {2, 1, 1, 2, 1, 3, 2, 3, 5, 4, 4};

        /*
         * Creating a HashSet named 's1' to store Integer values.
         * HashSet automatically removes duplicate values.
         * It only stores unique elements and does not maintain any order.
         */
        Set<Integer> s1 = new HashSet<Integer>();

        /*
         * Enhanced for loop to iterate through the array 'a'
         * Prints each element of the array (including duplicates)
         * Adds each element to the HashSet 's1' — duplicates are ignored internally
         */
        for (Integer x : a) {
            System.out.println(x);   // Prints all original array elements
            s1.add(x);               // Adds to HashSet — duplicate values ignored
        }

        System.out.println("---removing all the duplicate values--");

        /*
         * Loop through the HashSet to print only unique elements
         * Duplicates are removed because Set does not allow them
         */
        for (Integer y : s1) {
            System.out.println(y);   // Prints only unique values from the original array
        }
    }
}
