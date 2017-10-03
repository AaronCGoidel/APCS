package com.AaronCGoidel.APCS.labs.lab1_1;

/*
* Aaron Goidel
* October 3, 2017
* ISBN
* Lab 1.1
*/

import java.util.Scanner;


public class ISBN
{
    public static int getIntAtIndex(String stringToParse, int index){
        // successfully casts a character representation of an int at an index to a string
        // the value of '0' is 48 so subtracting this from any integer string will give the int literal of an int as a string
        return (int) stringToParse.charAt(index)-'0';
    }

    public static void main(String[] args){
        Scanner getIn = new Scanner(System.in);

        // I/O for ISBN input prompt
        System.out.print("Enter a properly formatted ISBN code: ");
        String isbnCode = getIn.nextLine();

        int char1, char2, char3, char4, char5, char6, char7, char8, char9; // declare variables to hold int literal of each digit
        String checkDigits = "0123456789X"; // this string is all possible check values the index of the remainder of the sum and 11 is the correct check digit

        // parse formatted ISBN into individual ints (these are not necessary but they make the code much more readable)
        char1 = getIntAtIndex(isbnCode, 0);
        char2 = getIntAtIndex(isbnCode, 2);
        char3 = getIntAtIndex(isbnCode, 3);
        char4 = getIntAtIndex(isbnCode, 5);
        char5 = getIntAtIndex(isbnCode, 6);
        char6 = getIntAtIndex(isbnCode, 7);
        char7 = getIntAtIndex(isbnCode, 8);
        char8 = getIntAtIndex(isbnCode, 9);
        char9 = getIntAtIndex(isbnCode, 10);

        // sum using (n * isbn_n) + (n * isbn_n)
        int sum = char1 + (2 * char2) + (3 * char3) + (4 * char4) + (5 * char5)
                + (6 * char6) + (7 * char7) + (8 * char8) + (9 * char9);

        // set check value to the character in the master string at the index of the remainder of the sum and 11
        char checkValue = checkDigits.charAt(sum % 11);

        System.out.println(String.format("The appropriate check digit for %s is: %s", isbnCode, checkValue));
    }
}
