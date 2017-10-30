package com.AaronCGoidel.APCS.labs.lab2_1;

import java.util.Scanner;

/**
 * A simple text-based adventure game
 * @author Aaron Goidel
 * @since 2017-10-24
 */

public class Adventure
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int choice;
        boolean easyIssue = false;
        // opening prompt
        System.out.println("Congratulations, you have been newly elected as a representative in the United States Congress." +
                "\nThe question is: can you get anything done?");
        System.out.println("Now that you've settled in let's choose an issue you would like to tackle...");

        /*
         * Scenario #1: Choose issue (always ends up as number 2)
         */
        do{
            System.out.println("1) Income inequality\n2) Build a small bridge in your state\n3) Gun control");
            System.out.print("Enter the number of the option you would like\n> ");
            choice = in.nextInt();
            if(choice == 2) easyIssue = true; // is the issue the "correct one?"
            else System.out.println("Nope. Not gonna happen. Let's try again...");
        }while(!easyIssue);
    }
}
