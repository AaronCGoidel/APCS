package com.AaronCGoidel.APCS.labs.lab5;

/*
* Aaron Goidel
* March 28, 2018
* Lab5.java
* Implements merge sort on Comparable objects
* Lab 5.1
*/

import java.util.Arrays;
import java.util.Scanner;

public class Lab5
{
    /**
     * Utility method for printing arrays
     * @param arr Comparable[]
     */
    public static void print(Comparable[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /**
     * Implements the merging of two arrays of elements which implement Comparable
     * @param arr1 Comparable[]
     * @param arr2 Comparable[]
     * @return Comparable[] Returns one sorted array which is a sorted combination of the two previous arrays
     */
    public static Comparable[] merge(Comparable[] arr1, Comparable[] arr2)
    {
        Comparable[] arr = new Comparable[arr1.length + arr2.length]; // create output array of the combined length of inputs

        // init a bunch of counters
        // (i is the index of arr1, j is index of arr2, k is index of the output arr)
        int i = 0, j = 0, k = 0;

        while(i < arr1.length && j < arr2.length){ // loop over both arrays until one is finished
            if(arr1[i].compareTo(arr2[j]) <= 0){ // check if the item from arr1 is smaller or equal
                arr[k] = arr1[i]; // if yes add it
                i++; // up arr1 counter
            }else{
                arr[k] = arr2[j]; // arr2 element is smaller add it to the output
                j++; // up arr2 counter
            }
            k++; // up output counter
        }
        /*
        The next block of code is to add all remaining elements to the output
        Note: only one of these will actually run per method call
         */
        for(;i < arr1.length; i++){ // dump the rest of arr1 into output (if any)
            arr[k] = arr1[i];
            k++;
        }
        for(;j < arr2.length; j++){ // dump the rest of arr2 into output (if any)
            arr[k] = arr2[j];
            k++;
        }
        // the above segment works since each sub-array is already sorted itself

        return arr;
    }

    /**
     * Base method of merge sort
     * Takes an array of Comparable items and recursively splits it into smaller arrays
     * Passes each smaller array to the merge method
     * @param arr Comparable[] Array to sort
     * @return Comparable[] sorted array
     */
    public static Comparable[] mergeSort(Comparable[] arr)
    {
        if(arr.length <= 1){ // base case: if there are not multiple elements in the array
            return arr;
        }
        Comparable[] left = Arrays.copyOfRange(arr, 0, arr.length/2); // split array into two halves
        Comparable[] right = Arrays.copyOfRange(arr, arr.length/2, arr.length); // second half
        return merge(mergeSort(left), mergeSort(right)); // call merge on recursive call of mergesort on each half
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Filename: "); // prompt user for array file

        int counter = 1; // count how many arrays have been sorted (for header)
        /*
        This next line is quite dense so I think it deserves a block comment.

        First: Use the scanner to take in the next line as the file path we need for the txt doc with arrays in it
        Second: Pass that string to the "readArrays" method from the helper class
        Third: For-each loop over the array of arrays passed from the helper class
         */
        for(Comparable[] unsorted : MergeSortHelperMethods.readArrays(in.nextLine())){
            System.out.println(String.format("----------Array #%d---------", counter)); // pretty print
            print(unsorted); // print the current unsorted array
            print(mergeSort(unsorted)); // execute a merge sort on the current unsorted array and print it
            System.out.println();
            counter++;
        }
    }
}
