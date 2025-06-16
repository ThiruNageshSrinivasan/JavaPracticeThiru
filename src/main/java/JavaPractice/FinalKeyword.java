// Declare a package named JavaPractice (helps organize your code)
package JavaPractice;

// Define a class named 'Final'
class Final {
    
    // Declare a constant variable 'pi' using the 'final' keyword
    // Once assigned, this value cannot be changed throughout the program
    final double pi = 3.14;

    // Method to display the value of pi
    void display() {
        System.out.println(pi + " this is an constant value cannot change");
    }
}

// Main class where program execution starts
public class FinalKeyword {

    public static void main(String[] args) {

        // Create an object of the 'Final' class
        Final fi = new Final();

        // Access and print the final variable directly using the object
        System.out.println(fi.pi);  // Output: 3.14

        // Call the display method to print the message including pi
        fi.display();  // Output: 3.14 this is an constant value cannot change
    }
}
