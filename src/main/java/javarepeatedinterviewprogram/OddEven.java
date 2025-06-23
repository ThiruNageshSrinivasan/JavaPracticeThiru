// Package declaration - this class is part of the 'javarepeatedinterviewprogram' package
package javarepeatedinterviewprogram;

// Importing Scanner class for taking user input
import java.util.Scanner;

// Class declaration
public class OddEven {

    // Main method - the entry point of the Java program
    public static void main(String[] args) {

        /*
         * Create a Scanner object named 'sc' to read input from the keyboard.
         * Scanner is used to accept user input at runtime.
         */
        Scanner sc = new Scanner(System.in);

        /*
         * Prompt the user to enter a number.
         * This message will appear in the console.
         */
        System.out.println("Enter the Number : ");

        /*
         * Read the input number entered by the user using sc.nextInt()
         * Store it in an integer variable named 'num'
         */
        int num = sc.nextInt();

        /*
         * Check if the number is even or odd using the modulus operator (%)
         * num % 2 == 0 means the number is divisible by 2 → Even
         */
        if (num % 2 == 0) {
            // If the number is even, print this message
            System.out.println("The Number Is Even  " + num);
        } else {
            // If the number is not divisible by 2, it's odd
            System.out.println("The Number Is Odd  " + num);
        }
    }
}

