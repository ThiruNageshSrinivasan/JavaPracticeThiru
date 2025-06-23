// Package declaration - this class is part of the 'collections' package
package collections;

// Importing PriorityQueue and Queue interfaces from java.util
import java.util.PriorityQueue;
import java.util.Queue;

// Class declaration
public class QueueEx {
    public static void main(String[] args) {

        /*
         * Creating a Queue using PriorityQueue implementation.
         * Queue is an interface — so we use a class like PriorityQueue to create it.
         * PriorityQueue stores elements in **natural order** (ascending for integers).
         */
        Queue<Integer> ql = new PriorityQueue<Integer>();

        // Adding elements to the queue
        ql.add(1);  // add 1
        ql.add(2);  // add 2
        ql.add(3);  // add 3
        ql.add(4);  // add 4
        ql.add(5);  // add 5

        /*
         * Remove the head (first) element of the queue.
         * For PriorityQueue, head is the **smallest element**.
         * So this will remove 1.
         */
        ql.remove();  // Removes 1

        /*
         * Enhanced for loop to iterate through the queue.
         * Note: PriorityQueue does NOT guarantee insertion order,
         * only that the **head (peek)** is the smallest.
         */
        for (Integer x : ql) {
            System.out.println(x);  // Will print remaining elements, unordered
        }
    }
}
