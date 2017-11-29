package com.AaronCGoidel.APCS.class_work;

import java.util.ArrayList;

public class SortingSpeedTest
{
    public static void main(String[] args)
    {
        int size = 100;

        int primArray[] = new int[size];
        Integer objArray[] = new Integer[size];
        ArrayList<Integer> integerArrayList = new ArrayList<>(size);

        for(int i = 0; i < size; i++){
            primArray[i] = i;
            objArray[i] = Integer.valueOf(i);
            integerArrayList.add(i, Integer.valueOf(i));
        }

        // ints
        double start = System.nanoTime();
        int sum = 0;
        for(int i : primArray){
            sum += i;
        }
        double avg = sum / primArray.length;
        double end = System.nanoTime();
        System.out.println("-----ints-----");
        System.out.println(avg);
        System.out.println(end - start + "ns");

        // objs
        start = System.nanoTime();
        sum = 0;
        for(int i : objArray){
            sum += i;
        }
        avg = sum / objArray.length;
        end = System.nanoTime();
        System.out.println("-----Integers-----");
        System.out.println(avg);
        System.out.println(end - start + "ns");

        // arraylist
        start = System.nanoTime();
        sum = 0;
        for(Integer integer : integerArrayList){
            sum += integer;
        }
        avg = sum / integerArrayList.size();
        end = System.nanoTime();
        System.out.println("-----ArrayList-----");
        System.out.println(avg);
        System.out.println(end - start + "ns");
    }
}
