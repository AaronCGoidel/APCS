package com.AaronCGoidel.APCS.class_work.card_packet;

/**
 * This is a class that tests the Card class.
 */
public class CardTester
{

    /**
     * The main method in this class checks the Card operations for consistency.
     *
     * @param args is not used.
     */
    public static void main(String[] args)
    {
        Card one = new Card("Heart", "1", 1);
        Card two = new Card("Diamond", "4", 3);
        Card three = new Card("Heart", "1", 1);

        System.out.println(one.matches(three));
        System.out.println(three.matches(two));
        System.out.println(two.toString());
    }
}
