package com.AaronCGoidel.APCS.class_work;

public class PrintStars
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 5; i++){
            System.out.println("*****".substring(i, 5));
        }
        for(int j = 0; j < 9; j+=2){
            System.out.println("*********".substring(0, j+1));
        }
    }
}
