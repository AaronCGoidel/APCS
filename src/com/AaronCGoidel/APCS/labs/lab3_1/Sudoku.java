package com.AaronCGoidel.APCS.labs.lab3_1;

/*
* Aaron Goidel
* December 5, 2017
* Sudoku
* Lab 3.1
*/

import java.util.Arrays;

public class Sudoku
{
    private int[][] puzzle;
    private int rows, cols;
    private int[] valid; // "parent" set which contains a sorted list of the numbers from 1-9

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

        /*
        Generates an array of the numbers between 1 and the size of the board
         */
        valid = new int[rows];
        for(int i = 0; i < rows; i++){
            valid[i] = i + 1;
        }
    }

    /**
     * Takes a set of numbers and sees if it is a permutation of a master array
     * Any valid row, column, or square, when sorted, will be the same as the parent
     * i.e. it checks if the sorted version of an array is the numbers from 1 to the maximum
     * @param toCheck int[] The numbers in the row, column, or square to check
     * @return boolean Whether or not the given input is a permutation of the "parent" set
     */
    private boolean isValidPermutation(int[] toCheck)
    {
        int[] temp;
        temp = toCheck.clone();
        Arrays.sort(temp);
        return Arrays.equals(valid, temp);
    }

    /**
     * Takes a given row id and checks if it is valid in sudoku
     * @param rowNum The number of the row
     * @return boolean Return value of the isValidPermutation method on the array which corresponds to the id
     */
    private boolean rowIsValid(int rowNum)
    {
        return isValidPermutation(puzzle[rowNum]);
    }

    /**
     * Takes a given column number and creates and passes an array of the values in the array
     * to check if it is a valid sudoku column
     * @param colNum Number of the column in the board
     * @return boolean Whether or not it is a valid permutation
     */
    private boolean colIsValid(int colNum)
    {
        int[] currentCol = new int[cols];
        // create an array to represent the current column
        for(int i = 0; i < cols; i++){
            currentCol[i] = puzzle[i][colNum];
        }

        return isValidPermutation(currentCol);
    }

    /**
     * Takes coordinates and returns whether or not a sub-square of the board is valid or not
     * The square that is checked is denoted by the row and column of the upper left hand corner
     * @param row Number of the row in the upper left corner
     * @param col Number of the column in the upper left corner
     * @return boolean Whether or not the square is valid
     */
    private boolean squareIsValid(int row, int col)
    {
        int[] currentSquare = new int[cols];
        int currentPos = 0;
        for(int i = 0; i < rows/3; i++){
            for(int j = 0; j < cols/3; j++){
                currentSquare[currentPos] = puzzle[i + row][j + col];
                currentPos++;
            }
        }

        return isValidPermutation(currentSquare);
    }

    /**
     * Checks if the sudoku puzzle is completed in a valid way
     * Iterates over each row, column, and sub-square and returns false if any of them return false
     * @return boolean Whether or not the puzzle is completed
     */
    public boolean isValid()
    {
        int x = -1;
        int y = -1;
        // Iterates over each row and each column
        for(int i = 0; i < rows; i++){
            if(!rowIsValid(i)){
                x = i; // If a row has an error store the row number
            }
            if(!colIsValid(i)){
                y = i; // If a column has an error store the column number
            }
            if(x >= 0 && y >= 0){
                System.out.print("Error at: (" + x + "," + y + ")\n"); // Print the location of the error
                return false;
            }
        }

        // Iterates over each 3x3 sub-square and checks if they are valid
        for(int i = 0; i < rows; i += 3){
            for(int j = 0; j < cols; j += 3){
                if(!squareIsValid(i, j)){
                    System.out.print("Error in square at: (" + i + "," + j + ")\n"); // Print the location of the error
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks if the board has a number in each position
     * @return boolean True if the board is full : False if the board contains any 0's
     */
    private boolean isFull()
    {
        for(int[] row : puzzle){
            for(int num : row){
                if(num == 0){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Inserts a user entered number into the board
     * @param row Row of the place in the board to play
     * @param col Column of the space on the board
     * @param num Number to insert
     * @return boolean True if the user has played in an empty space
     */
    public boolean insert(int row, int col, int num)
    {
        if(num == 0){
            puzzle[row][col] = num;
            return true;
        }
        puzzle[row][col] = num;
        return false;
    }

    /**
     * Pretty prints the sudoku puzzle
     */
    public void print()
    {
        System.out.println("|-------|-------|-------|"); // prints top rule
        for(int i = 0; i < puzzle.length; i++){ // iterate over each row in puzzle
            System.out.print("|"); // print pipe to start each line
            for(int j = 0; j < puzzle[i].length; j++){ // iterate over each number in a row
                // prints a pipe between every third number otherwise prints the number with spaces around it
                System.out.print(String.format(" %s", (j + 1) % 3 == 0 ? puzzle[i][j] + " |" : puzzle[i][j]));
            }
            if((i + 1) % 3 == 0){ // prints a rule every three rows
                System.out.println("\n|-------|-------|-------|");
            }else{
                System.out.println();
            }
        }

    }
}
