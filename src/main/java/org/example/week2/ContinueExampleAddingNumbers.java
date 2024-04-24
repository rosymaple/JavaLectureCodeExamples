package org.example.week2;

import static input.InputUtils.intInput;
public class ContinueExampleAddingNumbers {
    public static void main(String[] args) {        // start of main method
        // Ask user for 5 numbers between 1 and 100, and add them up. Ignore numbers outside this range
        int numbersEntered = 0;     // numbersEntered initialized here. we will start at 0.

        int sumOfNumbers = 0;       // int variable initialized here. we will start at 0.

        while ( numbersEntered < 5 ) {      // while statement, while numbersEntered is less than 5...
            int number = intInput("Please enter a number between 0 and 100.");
            // initialize our number variable above which we will use intInput to ask for...
            if (number < 0 || number > 100 ) {      // if number is less than 0 or greater than 100...
                System.out.println("You must enter a number between 0 and 100");    // print message
                continue;     // Skip the rest of the loop. If the while condition is still true, the loop will continue.
            }       // end of if statement

            numbersEntered++;       // the number of valid numbers entered in numbersEntered.

            //print message for user below.
            System.out.println("You have now entered " + numbersEntered + " number(s). The last valid number you entered was " + number);

            // You'll probably process the numbers somehow - let's add them up and figure out the average

            sumOfNumbers = sumOfNumbers + number;   // sumOfNumbers will be an equation.
        }   // end of while loop

        // print two messages for the user below...
        System.out.println("Thanks for using the program. The total of all the numbers was " + sumOfNumbers);
        System.out.println("And the average of all 5 numbers was " + sumOfNumbers/5);
        // the line above performs an equation in the print statement
    }   // end of main method
}       // end of public class