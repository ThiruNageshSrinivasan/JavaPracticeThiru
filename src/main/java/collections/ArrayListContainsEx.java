// Package declaration - this class belongs to the 'collections' package
package collections;

// Importing ArrayList class from java.util
import java.util.ArrayList;

// Class declaration
public class ArrayListContainsEx {

    // Main method - entry point of the program
    public static void main(String[] args) {

        /*
         * Create the first ArrayList named 'li' that stores Integer elements.
         * Add 0, 1, 2, 3 to it.
         */
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(0); // Add 0
        li.add(1); // Add 1
        li.add(2); // Add 2
        li.add(3); // Add 3

        /*
         * Create the second ArrayList named 'l2' to compare with 'li'.
         * You mistakenly added elements to 'li' again here.
         * The following should be l2.add(...), not li.add(...).
         * Corrected below:
         */
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(0); // Add 0 to l2
        l2.add(1); // Add 1 to l2
        l2.add(2); // Add 2 to l2
        l2.add(3); // Add 3 to l2

        /*
         * Use containsAll() to check whether all elements of l2 are present in li.
         * However, you are not storing or printing the result of this check.
         * Let's store it in a boolean variable.
         */
        boolean isAllPresent = li.containsAll(l2);

        /*
         * Print l2 to show its contents.
         * Output: [0, 1, 2, 3]
         */
        System.out.println(l2);

        /*
         * Print li to show its contents.
         * Output: [0, 1, 2, 3]
         */
        System.out.println(li);

        /*
         * Print the result of containsAll()
         * Output: true (because l2's elements are all in li)
         */
        System.out.println("Does li contain all elements of l2? " + isAllPresent);

        /*
         * Use an enhanced for-loop to print each element of li
         */
        for (Integer x : li) {
            System.out.println(x); // Prints each number one by one
        }
        li.removeAll(l2);
        System.out.println(li);
    }
}
