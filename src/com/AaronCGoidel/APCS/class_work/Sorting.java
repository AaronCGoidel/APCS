package com.AaronCGoidel.APCS.class_work;

/* AP CS
 * Sorting Algorithms
 * Starter Code
 * Spring 2018
 */

import java.util.Arrays;

public class Sorting
{
    public static int[] bubbleSort(int[] arr)
    {
        boolean changed = false;
        do {
            changed = false;
            for (int a = 0; a < arr.length - 1; a++) {
                if (arr[a] > arr[a + 1]) {
                    int tmp = arr[a];
                    arr[a] = arr[a + 1];
                    arr[a + 1] = tmp;
                    changed = true;
                }
            }
        } while (changed);
        return arr;
    }

    public static int[] insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++){
            int value = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > value){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr)
    {
        for(int currentPlace = 0; currentPlace < arr.length - 1; currentPlace++){
            int smallest = Integer.MAX_VALUE;
            int smallestAt = currentPlace + 1;
            for(int check = currentPlace; check < arr.length; check++){
                if(arr[check] < smallest){
                    smallestAt = check;
                    smallest = arr[check];
                }
            }
            int temp = arr[currentPlace];
            arr[currentPlace] = arr[smallestAt];
            arr[smallestAt] = temp;
        }
        return arr;
    }

    public static void print(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static int[] merge(int[] arr1, int[] arr2)
    {
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        for(;i < arr1.length; i++){
            arr[k] = arr1[i];
            k++;
        }
        for(;j < arr2.length; j++){
            arr[k] = arr2[j];
            k++;
        }
        return arr;
    }

    public static int[] mergeSort(int[] arr)
    {
        if(arr.length <= 1){
            return arr;
        }
        int[] left = Arrays.copyOfRange(arr, 0, arr.length/2);
        int[] right = Arrays.copyOfRange(arr, arr.length/2, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static void main(String[] args)
    {
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++)
            arr[i] = (int) (Math.random() * 10);
        print(arr);


     print(bubbleSort(arr));
	 print(insertionSort(arr));
	 print(selectionSort(arr));
	 print(mergeSort(arr));

    }
}
