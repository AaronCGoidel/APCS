package com.AaronCGoidel.APCS.class_work;

import java.util.Scanner;

public class Sum15
{
    public static void main(String[] args)
    {
        double max = 0;
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 15; i++){
            max += in.nextDouble();
        }
        System.out.println(max);
    }
}
