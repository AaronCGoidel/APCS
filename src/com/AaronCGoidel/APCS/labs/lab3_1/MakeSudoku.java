package com.AaronCGoidel.APCS.labs.lab3_1;

import java.util.*;
import java.io.*;

public class MakeSudoku{
  public static int[][] readSudoku(String fileName){
      //create the int[][] to return
      int[][] s = new int[9][9];

      //need a try catch to account for the possibilitiy
      //that the file doesn't exist
      try{
	  
	  //create a file object and a Scanner to read it
	  File f = new File(fileName);
	  Scanner in = new Scanner(f);

	  //using a Scanner read Sudoku from the file
	  //blanks are represented by 0s
	  for (int i = 0; i < 9; i++){

	      //read in each row as a string
	      String num = in.next();
	      for (int j = 0; j < 9; j++){

		  //get each number from the row
		  s[i][j] = Integer.valueOf(num.substring(j,j+1));
	      }
	  }
      }
      
      //catch and print the error
      catch(Exception e){
	  //if this prints java.io.FileNotFoundException:
	  //filename(No such file or directory) then the file
	  //doesn't exist in the correct place
	  //need to be in the same folder
	  System.out.println(e);
      }
      return s;
  }
  public static void main(String[] args){
    int[][] x = readSudoku("puzzle.txt");
    Sudoku a = new Sudoku(x);
    System.out.println(a.rowIsValid(1));
    System.out.println(a.colIsValid(1));
    System.out.println();
  }
}
