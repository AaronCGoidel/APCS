package com.AaronCGoidel.APCS.labs.lab3_1;

/*
* Aaron Goidel
* December 5, 2017
* Sudoku
* Lab 3.1
*/

import java.util.Scanner;

public class PlaySudoku
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the file path of your sudoku puzzle.\n> ");
        String path = in.next(); // Takes in the file where the puzzle is found
        Sudoku game = new Sudoku(MakeSudoku.readSudoku(path)); // Create new Sudoku by reading in the file at the given path

        while(!game.isValid()){ // Ask user for move if puzzle is not solved
            game.print(); // Print current game state
            System.out.println("What move would you like to make?");
            System.out.print("Row: "); // Take x position
            int row = in.nextInt();
            System.out.print("Column: "); // Take y position
            int col = in.nextInt();
            System.out.print("Value: "); // Take number to play
            int value = in.nextInt();
            game.insert(row, col, value); // Apply move to board
        }

        // Print win message and solved board
        System.out.println("Congratulations! You finished a sudoku puzzle!\nHere is your completed puzzle!");
        game.print();
    }
}
