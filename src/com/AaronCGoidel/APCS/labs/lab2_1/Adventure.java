package com.AaronCGoidel.APCS.labs.lab2_1;

/**
 * A simple text-based adventure game
 * @author Aaron Goidel
 * @since 2017-10-24
 */

public class Adventure
{
    /**
     * Calculates whether or not more time has been elapsed than a maximum value
     * @param start Time in milliseconds when time started
     * @param current Current system time in milliseconds
     * @param duration allowed time in milliseconds
     * @return boolean Is time up?
     */
    public static boolean checkTime(double start, double current, double duration)
    {
        // is the difference between the start and end less than allotted time?
        return current - start < duration;
    }

    /**
     * Takes a time in milliseconds and returns it in seconds
     * it simply divides by 1000
     * @param milli Time in milliseconds
     * @return double The time in seconds
     */
    public static double toSec(double milli)
    {
        return milli/1000;
    }

    public static void main(String[] args)
    {
        final double TIME_PERIOD = 10000;
        final double START_TIME = System.currentTimeMillis();
        double currentTime;

        // opening prompt
        System.out.println("Congratulations, you have been newly elected as a representative in the United States Congress." +
                "\nThe question is: can you get anything done?");

        System.out.println("Now that you've settled in");

        // main loop body
        do{
            currentTime = System.currentTimeMillis(); // take current system time
            System.out.println(toSec(TIME_PERIOD - (currentTime - START_TIME))); // print how much time is left in seconds


        }while(checkTime(START_TIME, currentTime, TIME_PERIOD));
    }
}
