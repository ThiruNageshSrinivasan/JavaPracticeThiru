// Package declaration - this class belongs to the 'collections' package
package collections;

// Import necessary classes
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

    public static void main(String[] args) {

        /*
         * Creating a TreeSet named 'stores_ase' to store Integer values.
         * TreeSet:
         * - Stores only unique values.
         * - Automatically sorts them in ascending order.
         */
        TreeSet<Integer> stores_ase = new TreeSet<Integer>();

        /*
         * Adding elements to the TreeSet.
         * Note:
         * - Duplicates like 139 will be ignored.
         * - All values will be stored in sorted (ascending) order.
         */
        stores_ase.add(144);
        stores_ase.add(139);
        stores_ase.add(132);
        stores_ase.add(135);
        stores_ase.add(133);
        stores_ase.add(134);
        stores_ase.add(136);
        stores_ase.add(137);
        stores_ase.add(138);
        stores_ase.add(139);  // Duplicate - will be ignored

        /*
         * Enhanced for loop to print all elements in ascending order
         * TreeSet automatically keeps them sorted.
         */
        for (Integer x : stores_ase) {
            System.out.println(x);  // Prints in order: 132, 133, 134, ...
        }

        /*
         * Printing message before showing descending order output
         */
        System.out.println("the descending order");

        /*
         * Using descendingIterator() method of TreeSet
         * It returns an iterator that traverses in reverse (descending) order.
         */
        Iterator itr = stores_ase.descendingIterator();

        /*
         * Loop through the TreeSet in reverse order and print each element
         */
        while (itr.hasNext()) {
            System.out.println(itr.next());  // Prints: 144, 139, 138, ...
        }
    }
}
