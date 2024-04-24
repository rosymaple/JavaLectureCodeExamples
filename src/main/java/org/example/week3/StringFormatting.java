package org.example.week3;

public class StringFormatting {

    public static void main(String[] args) {        // declare main method

        String college = "MCTC";        //string variable initialized
        String className = "Java Programming";      // string variable initialized
        int classCode = 2545;       // int variable initialized
        int credits = 6;        // int variable initialized
        double averageGrade = 84.545345;        // double variable initialized
        boolean isOnline = true;        // boolean variable initialized


        System.out.println("This class is " + classCode + " " + className + ". It is taught at "
        + college + ". It is " + credits + " credits, the average grade is " + averageGrade
        + "%. Is it online? " + isOnline + ".");        // This works but there is a better way to write this...

        // %d = int
        // %s = String
        // %f = double
        // formatted string below
        System.out.printf("This class is %d %s. It is taught at %s. It is %d credits. The average grade " +
                "is %.2f%%. Is it taught online? %s.\n ",
                classCode, className, college, credits, averageGrade, isOnline );       //printf is more concise.

        System.out.printf("The average grade is %.2f\n", averageGrade);     //this will print only the average grade.

    }       // end of main method
}       // end of public class
