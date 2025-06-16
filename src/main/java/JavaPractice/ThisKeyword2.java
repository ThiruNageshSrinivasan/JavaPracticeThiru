// Define a package (optional organizational unit for classes)
package JavaPractice;

// Declare a class to represent an employee
class Employees {
    int id;        // Employee ID
    String ename;  // Employee Name
    double sal;    // Employee Salary
    String cname;  // Company Name

    // Constructor 1: Takes ID, Salary (as double), and Company Name
    Employees(int id, double d, String cname) {
        this.id = id;         // Assign ID
        this.sal = d;         // Assign salary
        this.cname = cname;   // Assign company name
        // Note: ename remains uninitialized (null)
    }

    // Constructor 2: Takes ID, Name, Salary (as int), and Company Name
    Employees(int id, String ename, int sal, String cname) {
        this.id = id;          // Assign ID
        this.ename = ename;    // Assign employee name
        this.sal = sal;        // Assign salary (int gets promoted to double)
        this.cname = cname;    // Assign company name
    }

    // Method to display employee details
    void employeeDetails() {
        // Prints all employee attributes, including nulls if uninitialized
        System.out.println(id + " " + sal + " " + cname + " " + ename);
    }
}

// Main class to test employee creation
public class ThisKeyword2 {

    public static void main(String[] args) {

        // Create emp object using Constructor 1 (no ename provided)
        Employees emp = new Employees(1, 200000.00, "TECHMAHINDIRA");
        emp.employeeDetails();  // Outputs: 1 200000.0 TECHMAHINDIRA null

        // Create emp2 object using Constructor 2 (with ename)
        Employees emp2 = new Employees(12, "TECHMAHINDIRA", 120000, "thiru");
        emp2.employeeDetails(); // Outputs: 12 120000.0 thiru TECHMAHINDIRA
    }
}