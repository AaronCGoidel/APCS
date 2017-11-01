package com.AaronCGoidel.APCS.labs.lab2_1;

import java.util.Scanner;

/**
 * A simple text-based adventure game
 *
 * @author Aaron Goidel
 * @since 2017-10-24
 */

public class Adventure
{
    /* Loops n times and gives the option to resign (ends game) or one other random one (continues)*/
    public static boolean recess(int times)
    {
        Scanner in = new Scanner(System.in);
        int choice;
        String options[] = {"Hurry up congress.", "Are we serious come on...", "Please can we get going again?", "What the frick Congress?!"};
        for(int i = 0; i < times; i++){
            System.out.println("Congress is still out of session");
            System.out.println("1) " + options[(int) (Math.random() * 3)]); // choose random option from array
            System.out.println("2) Resign from office.");
            choice = in.nextInt();
            if(choice == 2){
                System.out.println("Game Over");
                return false; // returns false if you resign
            }
        }
        return true; // returns true if you do not resign
    }

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
        do{ // <--- here is my obligatory loop
            System.out.println("1) Income inequality\n2) Build a small bridge in your state\n3) Gun control");
            System.out.print("Enter the number of the option you would like\n> ");
            choice = in.nextInt();
            if(choice == 2) easyIssue = true; // is the issue the "correct one?"
            else System.out.println("Nope. Not gonna happen. Let's try again...");
        } while(!easyIssue); // only lets you progress if you choose the "correct" option
        System.out.println("Ok, seems simple enough. Let's draft some legislation.");
        System.out.println("1) Submit a bill to the House floor.");
        choice = in.nextInt();
        if(choice == 1){
            System.out.println("Congratulations! You are now the proud parent of H.R. 237." +
                    "\nAfter submitting your bill to the Speaker it has been sent to the House Transportation and Infrastructure Committee." +
                    "\nUnfortunately you lack the seniority to sit on this committee.");
            System.out.println("1) Ok. I guess I'll go and sit in on the committee hearings." +
                    "\n2) Screw this, it's impossible. (Resign from office)");

            choice = in.nextInt();
            if(choice == 1){
                System.out.println("At the hearing, a congressman from New Mexico proposes exempting companies that " +
                        "\ngive their employees free Nintendo Wii's as benefits from providing any documentation concerning the legality of their workers. " +
                        "\nThe rest of the committee favors the idea.");
                System.out.println("1) WHAT!? That has nothing to do with bridges at all. Tell these morons to stop bastardizing the bill." +
                        "\n2) Say nothing... Congress will be Congress.");
                choice = in.nextInt();
                if(choice == 1){
                    System.out.println("Your hesitance over the addition is met with ire. You are told to do your job, and the committee will do its job. The clause is added.\n");
                    System.out.println("At home later that night, you see that the representative from Colorado has gone on The Situation Room and called you a Greedy Bridge Baron. " +
                            "\nHe demands that more concessions be made to large corporations so as not to disrupt the economy. " +
                            "\nThe entire panel agrees with him.");
                    System.out.println("1) Issue a press release explaining why the bill will not be changed anymore." +
                            "\n2) What a @$#&!. I guess now I have to prepare a statement making the concessions");
                    choice = in.nextInt();
                    if(choice == 1){
                        System.out.println("Your statement makes you look unreasonable and stubborn. " +
                                "\nNo one in congress wants to sit at your lunch table and your hometown newspaper's front page reads \"CAN YOU BELIEVE THIS MORON WE ELECTED?\"");

                        System.out.println("\nGame Over"); // game over you have no friends
                    } else if(choice == 2){
                        System.out.println("Your feeble and cowardly concession pleases your congressional colleagues and corporate backers. " +
                                "\nBut before your bill can be voted on... It is time for congressional recess.");

                        // recess 10 times
                        if(recess(10)){ // if you do not resign in recess
                            System.out.println("Your dog has died."); // game over (your dog died)
                            System.out.println("You fall in to a deep depression and turn to drinking (apple juice of course). \nYou resign from office.");
                        }

                    }
                } else if(choice == 2){
                    System.out.println("Ok a few more changes have been made to your bill after you leave. But now it is time for it to hit the floor.");
                    System.out.println("1) What, how could they change it more? Whatever let's vote already");
                    choice = in.nextInt();
                    System.out.println("Whoops, too late. It's time for congressional recess.");


                    // recess 6 times
                    if(recess(6)){ // if you do not resign in recess
                        System.out.println("Your bill finally comes to a vote. \nThe house votes to strike everything related to the bridge and the motion passes.");
                        System.out.println("1) Vote Yea \n2)WHAT?! My bridge isn't even in there anymore! Vote Nay");
                        choice = in.nextInt();

                        System.out.println("Well the bill passes but you still have no bridge. " +
                                "\nNo one will vote for you in your next run for congress."); // finish
                    }
                }
            }
        } else{ // finish
            System.out.println("Yeah it's not like you were going to get much done anyways.");
            System.out.println("\nGame Over");
        }

    }
}

