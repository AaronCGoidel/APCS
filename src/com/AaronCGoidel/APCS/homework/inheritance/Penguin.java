package com.AaronCGoidel.APCS.homework.inheritance;

public class Penguin extends Animal
{
    private String name;

    public Penguin()
    {
        this("tuxedo", 2, "");
    }

    public Penguin(String name)
    {
        this("tuxedo", 2, name);
    }

    public Penguin(String color, int numOfLegs, String name)
    {
        super(color, numOfLegs);
        this.name = name;
    }

    @Override
    public void walk()
    {
        System.out.println("*Waddles Happily*");
    }

    public void swim()
    {
        System.out.println("*Dives Into The Depths*");
    }

    public void sealAttack()
    {
        super.setNumOfLegs(getNumOfLegs() - 1);
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
