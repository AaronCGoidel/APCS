package com.AaronCGoidel.APCS.labs.lab4;

abstract class Quadrilateral implements Polygon
{
    private int numSides;

    public Quadrilateral()
    {
        this.numSides = 4;
    }

    public int getNumSides()
    {
        return numSides;
    }
}
