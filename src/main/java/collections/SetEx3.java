// Package declaration - part of the 'collections' package
package collections;

// Importing required classes
import java.util.HashSet;
import java.util.Set;

// Class declaration
public class SetEx3 {

	public static void main(String[] args) {

		/*
		 * Creating the first HashSet 'ls' and adding the value 1 multiple times.
		 * HashSet allows only unique elements, so only one instance of 1 is stored.
		 */
		Set<Integer> ls = new HashSet<Integer>();
		ls.add(1); ls.add(1); ls.add(1);
		ls.add(1); ls.add(1); ls.add(1);
		ls.add(1); ls.add(1); ls.add(1);
		ls.add(1); ls.add(1);
		// Now, ls = [1]

		/*
		 * Creating a second HashSet 'ls1' and adding unique elements to it.
		 */
		Set<Integer> ls1 = new HashSet<Integer>();
		ls1.add(1);  // Common with ls
		ls1.add(2);
		ls1.add(3);
		ls1.add(4);
		// Now, ls1 = [1, 2, 3, 4]

		/*
		 * retainAll(): Keeps only the elements in 'ls' that are also in 'ls1'
		 * Since ls only had [1], and 1 is present in ls1, nothing is removed.
		 * If ls had other elements not in ls1, they would have been removed.
		 */
		ls.retainAll(ls1);
		// ls is still [1]

		/*
		 * addAll(): Adds all elements from ls1 into ls.
		 * After this, ls will have all elements from both sets (union).
		 */
		ls.addAll(ls1);
		// Now, ls = [1, 2, 3, 4]

		// Print the merged set 'ls'
		System.out.println(ls);  // Output: [1, 2, 3, 4] (order is not guaranteed)

		/*
		 * containsAll(): Checks if ls contains all elements of ls1.
		 * This returns a boolean, but you haven't stored or printed the result.
		 */
		ls.containsAll(ls1);  // TRUE, but result not used

		// Print the set again — unchanged
		System.out.println(ls);  // Output: [1, 2, 3, 4]

		/*
		 * Print elements of ls1 — will always show [1, 2, 3, 4] (order may vary)
		 */
		for (Integer x : ls1) {
			System.out.println(x);
		}
	}
}
