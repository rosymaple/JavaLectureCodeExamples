package org.example.week2;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class LoopGetDataForArray {

    public static void main(String[] args) {        // start of main method

        //Create an array to store 5 Strings
        String[] textbooks = new String[5];     // "textbooks" array can hold up to 5 elements

        // Loop - repeat 5 times. Notice the loop counter variable 'number'
        // counts from 0, 1, 2, 3, 4 - this is the same as the array element numbers
        // So, we can use the variable number to refer to each array element in turn
        // Can use a loop to read from, or write to, every array element in turn

        for (int number = 0 ; number < textbooks.length ; number++) {   // loop over textbook array length...
            //Get data about one book from the user
            String bookName = stringInput("Please enter name of textbook");
            // bookName will be stored as values in the textbooks array,
            // our loop counter will write over our "textbooks" array and add it to the textbooks array.
            textbooks[number] = bookName;       // number is our counter, textbooks.length(5) is our counter value.
        }       // end of for loop

        for (int number = 0 ; number < textbooks.length ; number++) {
            // this loop counter will loop over textbooks to print our index (number+1) to start from 1 and values in..
            // our array "textbooks"
            System.out.println("Book number " + (number+1) + " is " + textbooks[number]);
        }       // end of for loop that will print all of our users books entered into the program

        System.out.println("Thank you: here is the data you entered");      //print message for user
        System.out.println(Arrays.toString(textbooks));     //print textbooks array values for the user
        // this will print the "textbooks" array with no extra formatting, just [value,value,etc] for the user.
    }       // end of public main method
}       // end of public class