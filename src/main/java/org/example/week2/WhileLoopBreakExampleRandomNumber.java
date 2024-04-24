package org.example.week2;

import java.util.Random;
import java.util.Scanner;

import static input.InputUtils.stringInput;

public class WhileLoopBreakExampleRandomNumber {
    public static void main(String[] args) {        // start of main method

        Random randomNumberGenerator = new Random();        // new random number using random util library

        while (true) {      // while the user doesn't answer "q", print this below...

            System.out.println("Would you like a random number?");      //print message
            System.out.println("Enter any key for a random number, or Q to quit");  // enter a number for the program

            String userInput = stringInput();       // ask the user for input

            if (userInput.equalsIgnoreCase("Q")) {      // if user types in q or Q....
                break;   //immediately stops the loop, jump to next statement after the loop
            }       // end of if statement
            // another random number generated using random library...
            int randomNumber = randomNumberGenerator.nextInt();
            // .nextInt() with no argument generate a random number from all the possible integer values
            System.out.println("Your random number is " + randomNumber);        // prints randomNumber and a message
        }       // end of while statement
        System.out.println("Thanks for using the program - bye!");      //print goodbye message or if user gives up
    }       // end of main
}       // end of public class
