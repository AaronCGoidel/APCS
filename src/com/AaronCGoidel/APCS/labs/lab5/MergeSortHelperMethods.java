package com.AaronCGoidel.APCS.labs.lab5;

import java.util.*;
import java.io.*;
public class MergeSortHelperMethods{
    //read file
    public static Comparable[][] readArrays(String fileName){
	Comparable[][] arr = new Comparable[10][10];
	try{
	    File f = new File(fileName);
	    Scanner in = new Scanner(f);
	    for (int i = 0; i < 10; i++){
		String[] r = in.next().split(",");
		for (int j = 0; j < 10; j++){
		    arr[i][j] = (Comparable)r[j];
		}
	    }
	}
	catch (Exception e){
	    System.out.println(e);
	}	
	return arr;
    }
    
    //inclusive of start, exclusive of stop
    public static Comparable[] copyArr(Comparable[] a, int start, int stop){
	Comparable[] copy = new Comparable[stop-start];
	for (int i = start, j = 0; i < stop && j < stop - start; i++, j++){
	    copy[j] = a[i];
	}
	return copy;
    }

}
