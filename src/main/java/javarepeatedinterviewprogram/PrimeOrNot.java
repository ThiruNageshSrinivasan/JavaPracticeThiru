package javarepeatedinterviewprogram;
//Import Scanner for reading user input
import java.util.Scanner;

public class PrimeOrNot {

 public static void main(String[] args) {
     // Create a Scanner object to take input from the user
     Scanner sc = new Scanner(System.in);

     // Read the number entered by the user
     int num = sc.nextInt();

     /*
      * Call the isPrime() method and check the result
      * If the method returns true → the number is prime
      * If it returns false → the number is not prime
      */
     if (isPrime(num)) {
         System.out.println("The given number is a prime number");
     } else {
         System.out.println("The given number is a non-prime number");
     }
 }

 /*
  * This method checks whether a number is prime
  * It takes an integer 'number' as input
  * It returns true if the number is prime, otherwise false
  */
 public static boolean isPrime(int number) {
     // Any number less than or equal to 1 is not prime
     if (number <= 1) {
         return false;
     }

     /*
      * Loop from 2 to number/2
      * If the number is divisible by any i in this range, it's not prime
      */
     for (int i = 2; i <= number / 2; i++) {
         if (number % i == 0) {
             return false;  // Not prime
         }
     }

     // If no divisors found, the number is prime
     return true;
 }
}
