package com.AaronCGoidel.APCS.class_work;

import java.util.Scanner;

public class Switches
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an operator");
        String operator =  input.next();
        System.out.println("Enter an integer");
        int operandOne = input.nextInt();
        System.out.println("Enter another integer");
        int operandTwo = input.nextInt();

        switch(operator){
            case("+"):
                System.out.println(operandOne + operandTwo);
                break;
            case("-"):
                System.out.println(operandOne - operandTwo);
                break;
            case("*"):
                System.out.println(operandOne * operandTwo);
                break;
            case("/"):
                System.out.println(operandOne / operandTwo);
                break;
            default:
                System.out.println("You fool! That is not an opperatorn");
        }
    }
}
