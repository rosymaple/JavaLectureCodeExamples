package org.example.week2;

public class January {
    public static void main(String[] args) {      // start of main method

        for (int day = 1; day <= 31; day++) {     // for loop counter over "day" variable, which is 1.
              // when day is less than or equal to 31, loop "day" variable from 1-31
            if (day == 1 || day == 21 || day == 31) {      // if day is 1 or day is 21 or if day is 31...
                System.out.println("January " + day + "st");  // print this for the user...
            } else if (day == 2 || day == 22) {     // make the program print grammatically correct again...
                System.out.println("January " + day + "nd");        // print this for the user
            } else if (day == 3 || day == 23) {     // our 2nd else-if block...
                System.out.println("January " + day + "rd");        // print this for the user
            } else {        // last else block for all other days which will end with "th"
                System.out.println("January " + day + "th");      // print message for user
            }     // end of if-else inside for loop counter. we need this to print grammatically correct statements.
        }     // end of for loop counter counting over days of the month "1-31"
    }     // end of main method
}     // end of public class January