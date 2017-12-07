package com.AaronCGoidel.APCS.labs.lab3_1;

import java.util.Arrays;

public class Sudoku
{
    private int[][] puzzle;
    private int rows, cols;
    private int[] valid;
    public Sudoku(int[][] clues)
    {
        this.rows = 9;
        this.cols = 9;
        this.puzzle = new int[rows][cols];

        /*
        Loops over puzzle array and clues array and
        sets each element of puzzle to the corresponding element in clues
         */
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                puzzle[i][j] = clues[i][j];
            }
        }

        valid = new int[rows];
        for(int i = 0; i < rows; i++){
            valid[i] = i + 1;
        }

        System.out.println(Arrays.deepToString(puzzle));

    }

    private boolean isValidPermutation(int[] toCheck)
    {
        int[] temp;
        temp = toCheck.clone();
        Arrays.sort(temp);
        return Arrays.equals(valid, temp);
    }

    public boolean rowIsValid(int rowNum)
    {
        return isValidPermutation(puzzle[rowNum]);
    }

    public boolean colIsValid(int colNum)
    {
        int[] currentCol = new int[cols];
        for(int i = 0; i < cols; i++){
            currentCol[i] = puzzle[i][colNum];
        }

        System.out.println(Arrays.toString(currentCol));

        return isValidPermutation(currentCol);
    }

    public static void main(String[] args)
    {
        int[] x={1,2,3,4};
        int[] y={2,1,4,3};

        System.out.println(Arrays.equals(x, y));
        Arrays.sort(y);
        System.out.println(Arrays.equals(x, y));
    }

}
