package com.AaronCGoidel.APCS.class_work;

import java.util.Scanner;

public class NByNArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int rows, cols;
        int matrix[][];

        System.out.println("Enter the number of rows you want: ");
        rows = in.nextInt();
        System.out.println("Enter the number of columns you want: ");
        cols = in.nextInt();

        matrix = new int[rows][cols];

        System.out.println("\n\nHere are your " + rows * cols + " zeros dipshit!");
        for(int row[] : matrix){
            for(int elem : row){
                System.out.print(elem);
            }
            System.out.println();
        }
    }
}
