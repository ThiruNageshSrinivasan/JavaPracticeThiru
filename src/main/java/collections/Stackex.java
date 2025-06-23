// Package declaration - this class belongs to the 'collections' package
package collections;

// Import the Stack class from java.util
import java.util.Stack;

// Class declaration
public class Stackex {

    // Main method - starting point of the program
    public static void main(String[] args) {

        /*
         * Create a new Stack to store Integer elements.
         * Stack extends Vector, and uses LIFO (Last-In-First-Out) order.
         */
        Stack<Integer> li = new Stack<Integer>();

        /*
         * Pushing elements onto the stack using push().
         * Each call adds the value to the top of the stack.
         */
        li.push(0);
        li.push(1);
        li.push(0);
        li.push(1);
        li.push(0);
        li.push(1);
        li.push(0);
        li.push(1);
        li.push(0);

        /*
         * Print the full contents of the stack.
         * Stack's toString() shows the elements in order.
         * The last added element is at the end (top of stack).
         */
        System.out.println(li); // Output: [0, 1, 0, 1, 0, 1, 0, 1, 0]

        /*
         * Push another value (133) onto the top of the stack.
         * Stack becomes: [0, 1, 0, 1, 0, 1, 0, 1, 0, 133]
         */
        li.push(133);

        /*
         * Pop removes the top element from the stack.
         * Removes 133 (the last pushed item).
         * Stack becomes: [0, 1, 0, 1, 0, 1, 0, 1, 0]
         */
        li.pop();

        /*
         * Enhanced for loop to print each element in the stack.
         * Even though Stack is LIFO, iteration happens from bottom to top.
         */
        for (Integer x : li) {
            System.out.println(x);
        }
    }
}
