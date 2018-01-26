package com.AaronCGoidel.APCS.homework.inheritance;

public class Penguin extends Animal
{
    private String name;

    /**
     * Default constructor
     * Sets color to tuxedo and legs to 2
     * Blank name
     */
    public Penguin()
    {
        this("tuxedo", 2, "");
    }

    /**
     * Default color and leg number values
     * @param name String name of the Penguin
     */
    public Penguin(String name)
    {
        this("tuxedo", 2, name);
    }

    /**
     * Full constructor
     * @param color String color of Penguin
     * @param numOfLegs int Number of legs
     * @param name String name of Pengiun
     */
    public Penguin(String color, int numOfLegs, String name)
    {
        super(color, numOfLegs);
        this.name = name;
    }

    @Override
    /**
     * Override Animal class walk method
     * Penguin waddles
     */
    public void walk()
    {
        System.out.println("*Waddles Happily*");
    }

    /**
     * Prints swimming action to console
     */
    public void swim()
    {
        System.out.println("*Dives Into The Depths*");
    }

    /**
     * Decrements number of legs by one
     */
    public void sealAttack()
    {
        if(getNumOfLegs() > 0){
            super.setNumOfLegs(getNumOfLegs() - 1);
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
