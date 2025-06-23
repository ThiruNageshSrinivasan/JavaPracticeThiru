// Package declaration - this class is part of the 'collections' package
package collections;

// Importing LinkedList class from java.util package
import java.util.LinkedList;

// Class definition
public class LinkedListEx {

    // Main method - entry point of the Java program
    public static void main(String[] args) {

        /*
         * Creating a LinkedList that stores Integer values.
         * Even though LinkedList is generic, you're not specifying <Integer> 
         * in the constructor — which works, but it's better to write:
         * new LinkedList<Integer>()
         */
        LinkedList<Integer> li = new LinkedList();

        /*
         * Adding the same number (1) multiple times into the LinkedList.
         * Each call to li.add(1) adds a new node at the end of the list.
         * Duplicates are allowed in LinkedList.
         */
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(1);
        li.add(1);

        /*
         * Using enhanced for loop to iterate through the LinkedList.
         * Each element in the list is printed on a new line.
         */
        for (Integer x : li) {
            System.out.println(x);  // Will print '1' eight times
        }
    }
}
