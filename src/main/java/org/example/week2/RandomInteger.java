package org.example.week2;

import java.util.Random;
public class RandomInteger {

    public static void main(String[] args) {

        //initialize our random variable using the random util library... our variable will be called "random"
        Random random = new Random();

        int randomNumber = random.nextInt(10);  // our random number generator will generate 0-9

        System.out.println("Random secret number between 0 and 9 = " + randomNumber);   // print message for user

        int anotherRandomNumber = random.nextInt(1000); // random number between 0-999
        // the message below prints the anotherRandomNumber variable for the user
        System.out.println("Another random  number between 0 and 999 = " + anotherRandomNumber);

        // The random counter below counts from 1-10 instead of 0-9.
        // We need to generate a number between 0-9 and add a 1 to that number
        int andAnotherRandomNumber = random.nextInt(10) + 1;
        System.out.println("Another random number between 1 and 10 = " + andAnotherRandomNumber);
        // print a message for the user above, our 3rd random number variable
        // The variable below generates a number between 5-12
        // The range is 12 - 5 = 7, with 7 different possibilities of random number.
        int yetAnotherRandomNumber = random.nextInt(7) + 5;     // generate a random number again
        System.out.println("Another random number between 5 and 12 = " + yetAnotherRandomNumber);
        //  prints a random number decided by the random util in the line above
    }       // end of main method
}       // end of public class