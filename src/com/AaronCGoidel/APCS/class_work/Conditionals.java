package com.AaronCGoidel.APCS.class_work;

import java.util.Scanner;

public class Conditionals
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number \n> ");
        int num = in.nextInt();
        System.out.println(String.format(num + " is %s than 0", num < 0 ? "less" : "greater"));

        System.out.println("-----------------------");

        System.out.print("Enter a number of seconds \n> ");
        int secs = in.nextInt();
        System.out.println(secs + String.format("seconds %s one minute", secs == 60 ? "is" : "is not"));

        System.out.println("-----------------------");

        System.out.print("Enter side a of a triangle \n> ");
        int a = in.nextInt();
        System.out.print("Enter side b of a triangle \n> ");
        int b = in.nextInt();
        System.out.print("Enter side c of a triangle \n> ");
        int c = in.nextInt();

        if(a + b > c){
            System.out.println("You have entered a valid triangle");
            if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) System.out.println("You've entered a right triangle");
        }else System.out.println("Your side lengths do not form a triangle...");

        System.out.println("-----------------------");
    }
}
