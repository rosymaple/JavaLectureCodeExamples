package org.example.week1_if_statements;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class StringMethods {
    public static void main(String[] args) {

        // .length() counts the length of a variable...in this case, secretPassword is the variable.
        String secretPassword = "kittens";      // string variable for our program.
        int numberOfCharactersInPassword = secretPassword.length();
        // numberOfCharactersInPassword represents the length of secretPassword.
        System.out.println(numberOfCharactersInPassword);       // prints number of characters which is an int.

        if (secretPassword.length() > 12) {     // if secretPassword string is LONGER than 12 letters...
            System.out.println("Longer passwords are more secure, good choice.");       // print message for user
        } else {        // else statement in our if-else block...
            System.out.println("Consider using a longer password.");        // print message for user
        }

        // emails are usually lowercase
        String email = "Clara.James@MINNEAPOLIS.edu";       // our email variable for this program is defined.
        email = email.toLowerCase();        // lets change our email to all lowercase letters.
        System.out.println(email);      // prints an email but with all lowercase letters.

        // uppercase
        // The department code is uppercase
        String classIdentifier = "ITEC 2545";       // our classIdentifier variable is defined.
        classIdentifier = classIdentifier.toUpperCase();        // lets make sure our classIdentifier is uppercase.
//            System.out.println(classIdentifier);
        String uppercaseClassIdentifier = classIdentifier;      // uppercaseClassIndentifier is same as the line above.
        System.out.println(classIdentifier);        //print classIdentifier variable
        System.out.println(uppercaseClassIdentifier);       // print uppercaseClassIdentifier which is the same thing.

        // ends with
        // Is this email a .edu email?

        System.out.println(email.endsWith(".edu"));
        System.out.println(email.endsWith(".com"));

        // starts with
        // Is a class an ITEC class?

        String exampleEmail = "test@gmail.edu";     // exampleEmail is defined in our program.
        if (exampleEmail.endsWith(".edu"))  {       // if our exampleEmail variable ends with .edu it is a student email
            System.out.println("This is an education email address.");      // print message for student user.
        } else {        // else, if the exampleEmail does NOT end with .edu...
            System.out.println("This is not an education email.");      // print message for the not student user.
        }       // end of if-else statement.

        // starts with
        // Is a class an ITEC class?
        String classCode = stringInput("Please enter a class code.");   // enter string Input for our program
        System.out.println(classCode.startsWith("ITEC"));       // print the classCode variable if it starts with ITEC.
        // .startsWith() prints a true/false statement for the user
        if (classCode.startsWith("ITEC")) {     // if classCode .startsWith ITEC, print the message below...
            System.out.println("This is an ITEC class.");       // print positive message for the user.
        } else {        // if-else statement, our else statement below...
            System.out.println("This is NOT an ITEC class.");   // print negative message for the user.
        }       // end of if-else statement.

        // Look for support ticket requests that contain the text "server"

        String supportTicketDescription1 = "The server is down!";
        String supportTicketDescription2 = "My mouse pad is missing.";
        String supportTicketDescription3 = "All the servers need to be rebooted.";
        String supportTicketDescription4 = "Server problem - ALL the servers need to be rebooted.";
        String supportTicketDescription5= "I dropped my drink into the server.";
        String supportTicketDescription6 = "SERVER DOWN!!!";


        System.out.println(supportTicketDescription1.contains("server"));       // true
        System.out.println(supportTicketDescription2.contains("server"));       // false, this ticket does not contain..
        System.out.println(supportTicketDescription3.contains("server"));       // true
        System.out.println(supportTicketDescription4.contains("server"));       // true
        System.out.println(supportTicketDescription5.contains("server"));       // true
        System.out.println(supportTicketDescription6.contains("server"));       // false, this ticket does not contain..

        String serverProblem = "THE SERVER IS DOWN!!!";     // serverProblem variable which is a string...
        String searchTerm = "server";       // our searchTerm variable will be "server"...

        if (serverProblem.toUpperCase().contains(searchTerm.toUpperCase())) {
            // if our serverProblem (case insensitive) contains searchTerm variable (case insensitive)
            System.out.println("Found a server problem.");      // print a message for user. it does contain server.
        } else {        // if-else statement, if our serverProblem does NOT contain searchTerm "server"...
            System.out.println("This is not a server problem.");    /// print a message for user.
        }       // end of if-else statement.

        String uppercaseServerProblem = serverProblem.toUpperCase();        // serverProblem in uppercase letters...
        String uppercaseSearchTerm = searchTerm.toUpperCase();      // searchTerm in uppercase letters...
        if (uppercaseServerProblem.contains(uppercaseSearchTerm)) {
            // if uppercaseServerProblem contains uppercaseSearch term...
            System.out.println("Server problem.");      // print that it IS a server problem for our user.
        } else {        // if-else statement, else...
            System.out.println("Not a server problem.");        // print that it is NOT a server problem for our user.
        }       // end of if-else block.


        // why would you not use .contains() to test if a class was an ITEC class?
        // or an email was an education email?
        // .CONTAINS() can give us false positives. it is also case sensitive.

        String studentEmail = "abc@minneapolis.edu";        // studentEmail is defined in our program.
        System.out.println(studentEmail.contains(".edu"));      //checks if studentEmail contains .edu in the string.
        String trickStudentEmail = "abc.edu@gmail.com";     // this will show us why we DO NOT use contains() for this.
        System.out.println(trickStudentEmail.contains(".edu"));     // fix by using .endsWith()

        // Split sentence into words

        String sentence = "IntelliJ is a Java integrated development environment ";     // sentence variable initialized

        String[] words = sentence.split(" ");       // initializes our string array.
        System.out.println(Arrays.toString(words));     // .toString will edit our "words" array for printing...
        // we need to split our sentence variable.
        String firstWord = words[0];        // firstWord variable is our first element in words String array.
        System.out.println(firstWord);      // print our first element in words String array.

        String javaIDEs = "IntelliJ,Eclipse,NetBeans,Notepad++,VSCode";
        //javaIDEs is String variable defined in our program.
        String[] ides = javaIDEs.split(",");        // "ides" will represent our string sentence split!
        System.out.println(Arrays.toString(ides));      // .toString will edit our "javaides" variable...
        // and add a comma to our javaIDEs variable.
        for (int x = 0 ; x < ides.length ; x++) {
            System.out.println(ides[x]);
        }

        // Split class identifier into department and code
        String javaClass = "ITEC 2545";
        String[] javaClassIdentifierParts = javaClass.split(" "); //prints a space between two parts of javaClass.
        // .split() will give our variable substrings to work with as identifier parts...
        String department = javaClassIdentifierParts[0];        // "department" will represent the first part.
        String code = javaClassIdentifierParts[1];      // "code" will represent the second part in "javaClass"
        System.out.println(department);     // prints department for our user
        System.out.println(code);       // prints code for our user

        // trim - remove whitespace - spaces, tabs, newlines start and end of a string
        String userAddressInput = "    1503 Hennepin Avenue ";    //lets try to remove the whitespace in this variable
        userAddressInput = userAddressInput.trim();     // using .trim() we will remove the whitespace above.
        System.out.println(userAddressInput);       // print our userAddressInput...
        // which will be trimmed by the line above.

        // Format strings
        // printf - no newline - you need to add a /n

        String className = "Java Programming";      // className variable for our program below...
        double credits = 6.0;       // "credits" is a double variable. double can store decimal values.
        int studentsEnrolled = 24;      // int cannot store decimal values. studentsEnrolled initialized here.
        String format = "Online";       // "format" is our variable name initialized here

        // The Java programming class is 6 credits, delivered online, there are 24 students enrolled.
        System.out.println("The " + className + " is " +        // print a message for our user
                credits + " credits, delivered " + format + ", there are " +
                studentsEnrolled + " students enrolled.");


        // print a format string for our user...
        System.out.printf("The %s is %.3f credits, delivered %s, there are %d students enrolled\n",
                className, credits, format, studentsEnrolled);
        // print a message at the end of our program...
        System.out.println("End of example program with Java strings!");

    }       // end of main method
}       // end of public class