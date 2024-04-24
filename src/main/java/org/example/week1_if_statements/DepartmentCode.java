package org.example.week1_if_statements;
import static input.InputUtils.stringInput;

public class DepartmentCode {
    public static void main(String[] args) {
        String departmentCode = stringInput("Enter department code: ");
        // we will ask our user for string input because our department code is a string of letters.
        // Check for valid codes, ITEC, BTEC, ENGL, MATH, etc
        // we will check for the length of our department code
        if (departmentCode.length() == 4) {     // if-else statement, if department code is 4 letters...
            System.out.println("The code is valid");        // prints valid message for user
            departmentCode = departmentCode.toUpperCase();      // makes sure our code is printed uppercase
            System.out.println("The code is " + departmentCode);   // prints uppercase code + message for user
        } else {        // else, if the length is not 4, the else statement will run for our user.
            System.out.println("The code is not valid.");       // prints NOT valid message for user
        }       // end of if-else statement
    }       // end of main method
}       // end of public Class departmentCode