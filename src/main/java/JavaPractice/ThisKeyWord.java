package JavaPractice;

public class ThisKeyWord {
	// This program demonstrates the use of the 'this' keyword 
	// to distinguish instance variables from constructor parameters.


	    // Instance variables to store employee details
	    int i;
	    String name;
	    String companyname;

	    // Constructor to initialize the employee object
	    public ThisKeyWord(int id, String empname, String companyname) {
	        // Using 'this' keyword to refer to instance variables
	        this.i = id;  // Assigning constructor parameter 'id' to instance variable 'i'
	        this.name = empname;  // Assigning 'empname' to instance variable 'name'
	        this.companyname = companyname;  // Assigning 'companyname' to instance variable
	    }

	    // Method to display employee details
	    void emplyeesDetails() {
	        // Prints the employee ID, name, and company name
	        System.out.println(i + " " + name + " " + companyname);
	    }

	    // Main method - execution starts here
	    public static void main(String[] args) {
	        // Creating an object of the class with specific employee details
	        ThisKeyWord obj = new ThisKeyWord(1, "Thiru", "HCL");

	        // Calling the method to display employee details
	        obj.emplyeesDetails();
	    }
	}