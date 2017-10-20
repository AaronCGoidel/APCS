package com.AaronCGoidel.APCS.homework.little_homeworks;

import java.util.Scanner;

public class EnterPositive
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean positive;

        do{
            System.out.print("Enter a number: ");
            positive = in.nextDouble() > 0;
        }while(!positive);
    }
}
