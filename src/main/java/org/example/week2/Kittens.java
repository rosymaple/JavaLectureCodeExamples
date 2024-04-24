package org.example.week2;

import static input.InputUtils.stringInput;
public class Kittens {
    public static void main(String[] args) {        // start of public main method
        String secretPassword = "kittens";      // secretPassword will be a string of letters determined here.

        System.out.println();       // empty print line for readability
        String userPassword = stringInput("Enter the password: ");
        // ask the user for userPassword using stringInput

        int maxGuesses = 5;     // maxGuesses is an int value and it is 5.
        // we will use a while loop to make sure maxGuesses is used in our questions for the user.

        //Always use the .equals() method to check if two Strings have the exact same characters

        //Before we let the user in, we need to check that the password is correct
        //This loop will repeat while the password is NOT "kittens", our secretPassword
        while ( ! userPassword.equals(secretPassword) && maxGuesses > 1  ) {    // if userPassword is NOT secretPassword
            System.out.println("Password incorrect, access denied!"); // access denied message will print for the user.
            System.out.println("Try again!");       // ask the user to try again...
            // this loop will ask the user again for the userPassword...
            userPassword = stringInput("Enter the password");
            // If the user gets it wrong again, the loop will repeat.
            maxGuesses--;       // this will subtract 1 from maxGuesses variable every time this loop repeats
        }   //end of while loop

        if (maxGuesses > 1) {       // if maxGuesses is greater than 1
            System.out.println("Correct password - access granted");        // print message for user
        }       // end of if statement
        else {      // if-else statement
            System.out.println("Max number of password attempts.");     // maxGuesses (5) has been reached
            System.exit(0);     // program will terminate successfully in this line of code
        }       // end of if-else statement
        // TODO - top secret program here!
    }       // end of public main method
}       // end of public class
