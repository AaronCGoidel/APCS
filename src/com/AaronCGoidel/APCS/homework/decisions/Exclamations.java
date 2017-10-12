package com.AaronCGoidel.APCS.homework.decisions;

import java.util.Scanner;

public class Exclamations
{
    public static boolean isAffirmative(String answer)
    {
        // returns true if the given string is an accepted affirmative value 'y' or 'yes'
        return (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"));
    }

    public static void printResult(String option)
    {
        System.out.println("In this case you should probably say \"" + option + "\"");
    }

    public static void main(String[] args)
    {
        Scanner response = new Scanner(System.in);

        System.out.println("Hi!" +
                "\nThis program is intended to help you find the right thing to shout" +
                "\nwhen something doesn't quite go your way." +
                "\n(All school appropriate of course...)" +
                "\n\nAnswer yes or no to the following (or y or n)\n");

        System.out.print("Did your computer just crash? ");

        if(isAffirmative(response.nextLine())){
            System.out.print("Did you save in the last half-hour? ");

            if(isAffirmative(response.nextLine())){
                printResult("Uh Oh.");
            }else{
                printResult("HOLY SHIFT-KEY!");
            }
        }else{
            System.out.print("Did you accidentally serve Cabernet in champagne flutes? ");

            if(isAffirmative(response.nextLine())){
                printResult("Sacré Bleu!");
            }else{
                System.out.print("Did another prospector just jump your claim? ");

                if(isAffirmative(response.nextLine())){
                    printResult("Dangnabbit!");
                }else{
                    System.out.print("Did a superhero foil your dastardly plan?");

                    if(isAffirmative(response.nextLine())){
                        printResult("Curses!");
                    }else{
                        System.out.print("Is Han Solo talking about you two alone in the south passage? ");

                        if(isAffirmative(response.nextLine())){
                            printResult("You stuck-up, half-witted, scruffy looking nerf herder!");
                        }else{
                            printResult("Oh Fudge.");
                        }
                    }
                }
            }
        }
    }
}