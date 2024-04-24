package org.example.week2;

import static input.InputUtils.doubleInput;

public class BusFares {
    public static void main(String[] args) {        // start of main method

        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // initialize our dayNames array above...

//        int numberOfDays = 7;
        double total = 0;       // initialize our "total" variable which we will start at 0.
        // off by one error
        for (int day = 0; day < dayNames.length ; day++) {      // our dayNames loop counter...
            String dayName = dayNames[day];     // dayName is going to be ONE of the elements from the dayNames array.
            double amountSpent = doubleInput("What did you spend " +
                    "on bus fares on " + dayName);      // initializes amountSpent by the user, dayName prints one day.
            total = total + amountSpent;        // "total" variable is going to be an equation.
            // total variable has already been initialized, so no need to add variable type to beginning.
        }       // end of for loop
        System.out.printf("Total for the week = $%.2f", total);     //print a message for our user using a format string
    }       // end of public method
}       // end of class method
