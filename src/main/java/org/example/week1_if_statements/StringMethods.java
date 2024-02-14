package org.example.week1_if_statements;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class StringMethods {
    public static void main(String[] args) {

        // length
        String secretPassword = "kittens";
        int numberOfCharactersInPassword = secretPassword.length();
        System.out.println(numberOfCharactersInPassword);

        if (secretPassword.length() > 12) {
            System.out.println("Longer passwords are more secure, good choice.");
        } else {
            System.out.println("Consider using a longer password.");
        }




        // lowercase
        // emails are usually lowercase
        String email = "Clara.James@MINNEAPOLIS.edu";
        email = email.toLowerCase();
        System.out.println(email);

        // uppercase
        // The department code is uppercase
        String classIdentifier = "ITEC 2545";
//            classIdentifier = classIdentifier.toUpperCase();
//            System.out.println(classIdentifier);
        String uppercaseClassIdentifier = classIdentifier;
        System.out.println(classIdentifier);
        System.out.println(uppercaseClassIdentifier);

        // ends with
        // Is this email a .edu email?

        System.out.println(email.endsWith(".edu"));
        System.out.println(email.endsWith(".com"));

        // starts with
        // Is a class an ITEC class?

        String exampleEmail = "test@gmail.edu";
        if (exampleEmail.endsWith(".edu"))  {
            System.out.println("This is an education email address.");
        } else {
            System.out.println("This is not an education email.");
        }

        // starts with
        // Is a class an ITEC class?
        String classCode = stringInput("Please enter a class code.");
        System.out.println(classCode.startsWith("ITEC"));

        if (classCode.startsWith("ITEC")) {
            System.out.println("This is an ITEC class.");
        } else {
            System.out.println("This is NOT an ITEC class.");
        }


        // contains
        // Look for support ticket requests that contain the text "server"

        String supportTicketDescription1 = "The server is down!";
        String supportTicketDescription2 = "My mouse pad is missing.";
        String supportTicketDescription3 = "All the servers need to be rebooted.";
        String supportTicketDescription4 = "Server problem - ALL the servers need to be rebooted.";
        String supportTicketDescription5= "I dropped my drink into the server.";
        String supportTicketDescription6 = "SERVER DOWN!!!";


        System.out.println(supportTicketDescription1.contains("server"));       // true
        System.out.println(supportTicketDescription2.contains("server"));       // false
        System.out.println(supportTicketDescription3.contains("server"));       // true
        System.out.println(supportTicketDescription4.contains("server"));       // true
        System.out.println(supportTicketDescription5.contains("server"));       // true
        System.out.println(supportTicketDescription6.contains("server"));       // false

        String serverProblem = "THE SERVER IS DOWN!!!";
        String searchTerm = "server";

        if (serverProblem.toUpperCase().contains(searchTerm.toUpperCase())) {
            System.out.println("Found a server problem.");
        } else {
            System.out.println("This is not a server problem.");
        }

        String uppercaseServerProblem = serverProblem.toUpperCase();
        String uppercaseSearchTerm = searchTerm.toUpperCase();
        if (uppercaseServerProblem.contains(uppercaseSearchTerm)) {
            System.out.println("Server problem.");
        } else {
            System.out.println("Not a server problem.");
        }


        if (uppercaseServerProblem.contains(uppercaseSearchTerm)) {
            System.out.println("Server problem");
        } else {
            System.out.println("Not a server problem.");
        }

        // why would you not use .contains() to test if a class was an ITEC class?
        // or an email was an education email?

        String studentEmail = "abc@minneapolis.edu";
        System.out.println(studentEmail.contains(".edu"));
        String trickStudentEmail = "abc.edu@gmail.com";
        System.out.println(trickStudentEmail.contains(".edu"));     // fix by using .endsWith()

        // Split sentence into words

        String sentence = "IntelliJ is a Java integrated development environment ");

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String firstWord = words[0];
        System.out.println(firstWord);

        String javaIDEs = "IntelliJ,Eclipse,NetBeans,Notepad++,VSCode";
        String[] ides = javaIDEs.split(",");
        System.out.println(Arrays.toString(ides));

        // Split class identifier into department and code

        // trim - remove whitespace - spaces, tabs, newlines start and end of a string
        String userAddressInput = "    1503 Hennepin Avenue ";






    }
}