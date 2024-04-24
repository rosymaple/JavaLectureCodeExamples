package org.example.week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class CountIncidences {
    public static void main(String[] args) {

        List<Double> speeds = new ArrayList<>();        // initialize arrayList variable named "speeds"

        int totalHours = 12;        // int totalHours variable will be initialized as 12

        for (int hour = 0; hour < totalHours; hour++) {     // loop over totalHours with hour variable.
            // when hour is less than totalHours, loop counter
            double speed = positiveDoubleInput("Enter the internet speed for hour " + hour);
            // initialize speed variable using positiveDoubleInput from our user to save internet speed input
            speeds.add(speed);      // add user input variable to the arrayList "speeds"
        }       // end of for loop over totalHours

        System.out.println("All the speeds are:");      // prints a message for our user. below will print format string

        for (int hour = 0; hour < speeds.size(); hour++) {      // loop over the size of speeds using hour variable
            // when our loop counter variable is smaller than the size of "speeds" arrayList...
            double speed = speeds.get(hour);        // retrieve hour from our arrayList which is also the index...
            System.out.printf("Hour: %d  Speed %.2f\n", hour, speed);       // print formatted string for our user
        }       // end of loop over speeds arrayList

        // Count the number of times the speed was 0

        int zeroCount = 0;      // initialize our counting variable "zeroCount" which will start at 0

        for (double speed: speeds) {        // for loop over elements in speeds arrayList
            if (speed == 0) {       // if element in "speeds" arrayList is equal to 0 ...
                zeroCount++;        // add one to zeroCount variable
            }       // end of if statement
        }       // end of for loop

        System.out.println("Number of times speed was 0 (no connection) : " + zeroCount);
        // print variable zeroCount for the user (contains the amount of times speed was equal to 0 in speeds arrayList)


        // Remove all zeros from speeds array list
        while (speeds.contains(0.0)) {      // while loop for speeds arrayList containing double value "0.0"
            speeds.remove(0.0);         // remove speeds element from arrayList
        }       // end of while loop

        /* Questions:
           - Why remove 0.0 instead of 0?
           - Why is a while loop used instead of a for loop?
         */

        // Figure out average speed
        double total = 0;       // initialize our counting variable "total" which will contain a "double" value
        for (double speed: speeds) {        // loop over speeds array
            total = total + speed;      // add each element from arrayList into the variable "total"
        }       // end of for loop over speeds array

        double average = total / speeds.size();     // initialize variable named "average" which is a calculation
        // take the total elements all added together from the arrayList...and divide it by the size of the arrayList

        System.out.println("The average speed is " + average);      // print average variable which is a calculation
        System.out.println(speeds);     // print speeds arrayList
    }       // end of main method
}       // end of public class