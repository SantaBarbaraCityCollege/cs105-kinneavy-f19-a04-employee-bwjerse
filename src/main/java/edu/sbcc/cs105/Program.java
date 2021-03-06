/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Brian Jerse
 */
package edu.sbcc.cs105;

/**
 * This class provides first level testing the Employee object.
 *
 */
public class Program {

    /**
     * Constructor that creates a new Employee with an initial name and salary.
     * 
     */
    private String employeeName = "unknown";
    private double currentSalary = 0.0;

    public Program(String employeeName, double currentSalary) {
        this.employeeName = employeeName;
        this.currentSalary = currentSalary;
        // instance variable is private
    }

    // using this to avoid issues with variables
    public String getName() {
        return employeeName;
    }

    public double getSalary() {
        return currentSalary;
        // return salary, seems simple enough
    }

    /**
     * Raise the salary by the amount specified by the explicit argument.
     * 
     */
    public void raiseSalary(double byPercent) {
        currentSalary = currentSalary * (byPercent / 100);
    }
// harrysSalary, shouldn't it be currentSalary?
    public static void main(String[] args) {
        Program harry = new Program("Harry", 10000);
harry.raiseSalary(10); // Harry gets a 10% raise.
double harrysSalary = harry.getSalary();
    }
}