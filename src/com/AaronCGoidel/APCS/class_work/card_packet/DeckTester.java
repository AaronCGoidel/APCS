package com.AaronCGoidel.APCS.class_work.card_packet;


/**
 * This is a class that tests the Deck class.
 */
public class DeckTester
{

    /**
     * The main method in this class checks the Deck operations for consistency.
     *
     * @param args is not used.
     */
    public static void main(String[] args)
    {
        Deck deck = new Deck(new String[] {"1", "2", "3"}, new String[] {"c", "h", "d"}, new int[] {1, 2, 3});
        System.out.println(deck.toString());
        System.out.println(deck.deal());
        System.out.println(deck.toString());
        System.out.println(deck.deal());
        System.out.println(deck.toString());
    }
}
