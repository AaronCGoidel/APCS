package com.AaronCGoidel.APCS.class_work;

/* AP CS
 * Sorting Algorithms
 * Starter Code
 * Spring 2018
 */

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

    public static void main(String[] args)
    {
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++)
            arr[i] = (int) (Math.random() * 10);
        print(arr);


     print(bubbleSort(arr));
	 print(insertionSort(arr));
	 print(selectionSort(arr));

    }
}
