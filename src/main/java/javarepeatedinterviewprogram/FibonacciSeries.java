package javarepeatedinterviewprogram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user how many Fibonacci numbers to print
        System.out.print("Enter how many numbers you want in the Fibonacci series: ");
        int n = sc.nextInt();

        // Starting values
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: " + a + " " + b + " ");

        // Loop starts from 2 because we already printed 0 and 1
        for (int i = 2; i < n; i++) {
            int c = a + b;    // Next number in the series
            System.out.print(c + " ");
            a = b;            // Shift b to a
            b = c;            // Shift c to b
        }
    }
}

