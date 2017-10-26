package com.AaronCGoidel.APCS.class_work;

import java.util.Scanner;

public class Shifter
{
    public static char applyShift(char original, int shift)
    {
        int distance = shift % 26;
        if(!Character.isWhitespace(original)) return (char)(original + distance);
        return ' ';
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to encode");
        String inputString = in.nextLine();
        System.out.println("Enter the amount to shift by");
        int shiftValue = in.nextInt();

        for(int i = 0; i < inputString.length(); i++)
        {
            System.out.print(applyShift(inputString.charAt(i), shiftValue));
        }

    }
}
