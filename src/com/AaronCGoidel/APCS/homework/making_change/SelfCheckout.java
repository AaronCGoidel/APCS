package com.AaronCGoidel.APCS.homework.making_change;

import java.util.Scanner;

public class SelfCheckout
{
    public static double roundOff(double toRound)
    {
        return Math.round(toRound * 100.0) / 100.0;
    }
    public static void main(String[] args)
    {
        Scanner getInput = new Scanner(System.in);

        double total = 0;
        double unitPrice, quantity, subtotal;
        for(int i=0; i<10;i++)
        {
            System.out.println(String.format("Item #%d", i+1));
            System.out.print("Enter Price\n$");
            unitPrice = getInput.nextDouble();
            System.out.print("Enter Number of Items\n>");
            quantity = getInput.nextDouble();
            subtotal = roundOff(unitPrice * quantity);
            total += subtotal;
            System.out.println(String.format("Subtotal: $%.2f", subtotal));
        }
        System.out.println(String.format("Total: $%.2f", total));
    }
}
