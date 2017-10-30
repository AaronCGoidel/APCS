package com.AaronCGoidel.APCS.class_work;

import java.util.Scanner;

public class Reverser
{
    public static String Reverse(String toReverse)
    {
        StringBuilder backwards = new StringBuilder();
        int len = toReverse.length();
        for(int i = 0; i < len; i++) backwards.append(toReverse.charAt(len - i - 1));
        return backwards.toString();
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println(Reverse(in.next()));
    }
}
