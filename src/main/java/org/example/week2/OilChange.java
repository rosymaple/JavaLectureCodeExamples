package org.example.week2;

public class OilChange {
    public static void main(String[] args) {

        int mileage = 150000;     // mileage variable
        int interval = 3000;      // interval variable

        for (int oilChange = 0 ; oilChange < 8; oilChange++) {        // loop over oilChange 8 times
            mileage = mileage + interval;     // mileage has already been initialized, perform calculation on variable
            System.out.println("Get oil change at " + mileage + " miles");    // print message for the user
        }     // end of for loop for oil change program

        for (int miles = mileage; miles < (mileage + 8 * interval); miles+=interval) {
             // loops over "mileage" w/ miles variable until miles is less than (milage + 8 * interval)
            // the miles value is increased by the interval value
            System.out.println("Get oil change at " + miles + " miles");        // print a message for the user
        }       // end of if loop
    }       // end of main method
}       // end of public class