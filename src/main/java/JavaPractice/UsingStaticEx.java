package JavaPractice;

//Class to demonstrate static variables and methods in Java
class UsingStaticEx {
 int id; // Instance variable to store employee ID
 String name; // Instance variable to store employee name
 static String companyname = "HCLtech"; // Static variable shared among all objects

 // Constructor to initialize employee details
  UsingStaticEx(int i, String n) {
     this.id = i; // Assign the given ID to the instance variable
     this.name = n; // Assign the given name to the instance variable
 }

 // Method to display employee details
 void employeeDetails() {
     // Prints ID, name, and company name (shared across all instances)
     System.out.println(id + " " + name + " " + companyname);
 }

 // Static method to change the company name
 static void companyname() {
     companyname = "Infosys"; // Updates the company name for all objects
 }

 // Main method - execution starts here
 public static void main(String[] args) {
     // Calls the static method to update company name before object creation
     UsingStaticEx.companyname();

     // Creating multiple employee objects and displaying their details
     UsingStaticEx obj = new UsingStaticEx(01, "THIRU");
     obj.employeeDetails(); // Displays updated company name "Infosys"

     UsingStaticEx obj1 = new UsingStaticEx(02, "RISHI");
     obj1.employeeDetails();

     UsingStaticEx obj2 = new UsingStaticEx(03, "SANJAY");
     obj2.employeeDetails();

     UsingStaticEx obj3 = new UsingStaticEx(04, "PANDU");
     obj3.employeeDetails();

     UsingStaticEx obj4 = new UsingStaticEx(05, "NARESH");
     obj4.employeeDetails();

     UsingStaticEx obj5 = new UsingStaticEx(06, "ASHOK");
     obj5.employeeDetails();

     UsingStaticEx obj6 = new UsingStaticEx(07, "VIGNESH");
     obj6.employeeDetails();
 }
}
