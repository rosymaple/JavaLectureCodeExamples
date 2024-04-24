package org.example.week3;

public class AlignText {
    public static void main(String[] args) {

        int[] classCodes = {2545, 2505, 2560};      // classCodes is an int array
        String[] classNames = {"Java", "C#", "Web"};        // classNames is a string array
        double[] averageClassSizes = { 22.34233, 17.42323, 14.234234};      //averageClassSizes is a double array

        String templateString = "%-10s%-10s%-10s\n";        // formatted string for our user, templateString is variable
        System.out.printf(templateString, "Code", "Name", "Average Size");      // formatted print for our user
        System.out.println("--------------------------------");     // prints a line of dashes to seperate our prints

        String tableTemplateString = "%-10d%-10s%-10.2f\n";     // another formatted string for our user
        for(int c = 0; c < classCodes.length; c++) {     //this will loop the classCodes array over the length of array
            int code = classCodes[c];           //this will place the classCodes Array data into a variable called code
            String name = classNames[c];        //this will place the classNames Array data into a variable called name
            double averageClassSize = averageClassSizes[c];     // averageClassSize is the value in averageClassSizes!!!
            System.out.printf(tableTemplateString, code, name, averageClassSize);       // print format string
            System.out.println();       // print empty line of code
        }       //end of for loop over classCodes length
    }       // end of main method
}       // end of public class
