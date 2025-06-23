// Package declaration - this class is part of the 'collections' package
package collections;

// Importing the ArrayList class
import java.util.ArrayList;

// Class definition
public class ArrayListMergeex {

    // Main method - entry point of the program
    public static void main(String[] args) {

        /*
         * Creating the first ArrayList named li and adding Integer values to it.
         */
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(0); // Add 0
        li.add(1); // Add 1
        li.add(2); // Add 2
        li.add(3); // Add 3

        /*
         * Creating the second ArrayList named li1 and adding Integer values to it.
         */
        ArrayList<Integer> li1 = new ArrayList<Integer>();
        li1.add(0);  // Add 0
        li1.add(8);  // Add 8
        li1.add(9);  // Add 9
        li1.add(8);  // Add another 8

        /*
         * Merging li1 into li using addAll()
         * After this, li contains elements of both li and li1
         */
        li.addAll(li1);

        /*
         * Iterate and print each element of li after merging
         */
        for (Integer x : li) {
            System.out.println(x);
        }
    }
}
