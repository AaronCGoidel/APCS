package com.AaronCGoidel.APCS.class_work;

import java.util.Scanner;

public class WhileLoop
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int max, current;
        boolean done = false;

        System.out.print("Enter a number: ");
        max = in.nextInt();

        while(!done){
            System.out.print("Enter a number: ");
            current = in.nextInt();

            if(current > max) max = current;

            System.out.print("Enter another number? (y/n): ");
            done = !(in.next().equalsIgnoreCase("y"));
        }
        System.out.println("Max: " + max);
    }
}
