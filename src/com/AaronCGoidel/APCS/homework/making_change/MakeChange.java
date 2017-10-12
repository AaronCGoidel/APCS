package com.AaronCGoidel.APCS.homework.making_change;

import java.util.Scanner;

public class MakeChange {
    public static double amountDue(double costOfGoods, double amountPaid){
        return roundOff(amountPaid-costOfGoods);
    }

    public static double roundOff(double toRound)
    {
        return Math.round(toRound * 100.0) / 100.0;
    }

    public static void main(String[] args){
        Scanner getIn = new Scanner(System.in);

        double DENOMINATIONS[] =  {1.00, .25, .10, .05, .01};
        int currentDenomination = 0;
        int numberOfAmount;

        System.out.print("Enter Price\n$");
        double cost = getIn.nextDouble();
        System.out.print("Enter Amount Paid\n$");
        double paid = getIn.nextDouble();

        double due = amountDue(cost, paid);

        if(due<0){
            System.out.println("THIEF!!!");
        } else if(due==0){
            System.out.println("Perfect Change.");
        } else{
            System.out.println(due);
            while(due>0){
                numberOfAmount = (int) Math.floor(due/DENOMINATIONS[currentDenomination]);
                due-=numberOfAmount*DENOMINATIONS[currentDenomination];
                System.out.println(String.format("$%.2f: %d", DENOMINATIONS[currentDenomination], numberOfAmount));
                currentDenomination += 1;
            }
        }
    }
}

