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
 * This class implements an emplyee which is a person with a name and a salary.
 *
 */
public class Employee {

    /**
     * Constructor that creates a new Employee with an initial name and salary.
     * 
     */
    private String employeeName;
    private double currentSalary;
    public Employee(String employeeName, double currentSalary) {
        this.employeeName = employeeName;
        this.currentSalary = currentSalary;
//instance variable is private
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
    // formula to raise salary
    public void raiseSalary(double byPercent) {
		currentSalary = (currentSalary * (byPercent * 0.01)) + currentSalary;
    }

}