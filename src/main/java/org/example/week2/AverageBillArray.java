package org.example.week2;

import static input.InputUtils.doubleInput;

public class AverageBillArray {
    public static void main(String[] args) {        // start of main method

        String[] months = { "January", "February", "March", "April", "May",
                "June", "July", "August", "September",
                "October", "November", "December" };
        // months will represent our string array of months of the year...

        for (int x = 0 ; x < months.length; x++) {      // our for loop counter over months array
            double MonthlyBill = doubleInput("What was your bill for" + months[x] + "? "); }
            // monthlyBill will contain a double variable and we will use doubleInput to ask the user a question
    }       // end of public main method
}       // end of public class AverageBillArray
