package com.AaronCGoidel.APCS.class_work;

/*
* Aaron Goidel
* September 6, 2017
* Code Copy
*/

import java.util.Scanner;

public class CodeCopy
{
    public static void main(String[] args)
    {
        String name;
        int lenName;
        String favColor;
        int randNum;

        Scanner in = new Scanner(System.in);

        System.out.println("Hello! What is your name?");

        name = in.nextLine();
        lenName = name.length();

        System.out.println("Your name has " + lenName + " letters.");
        for(int i = 0; i < lenName; i++)
        {
            System.out.println((i+1) + ". " + name.substring(i, i+1));
        }

        System.out.println("What is your favorite color?");
        favColor = in.nextLine();
        String[] feelings = {"love", "hate", "like", "dislike", "feel neutral toward"};
        randNum = (int)(Math.random() * feelings.length);
        System.out.println("I " + feelings[randNum] + " " + favColor + ".");

        System.out.println("It was nice talking to you, " + name + ". Goodbye.");
    }
}
