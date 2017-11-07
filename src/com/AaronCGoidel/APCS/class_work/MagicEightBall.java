package com.AaronCGoidel.APCS.class_work;

import java.util.Scanner;

public class MagicEightBall
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Question: ");

        String responses[] = {"Yes", "What do I know I'm just a pool ball", "No", "Maybe", "I don't know ask Julia's program", "Sure why not"};

        in.next();

        System.out.println("The Magic 8 Ball says: " + responses[(int) (Math.random() * responses.length)]);
    }
}
