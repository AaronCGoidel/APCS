package com.AaronCGoidel.APCS.labs.lab4;

/*
* Aaron Goidel
* February 26, 2018
* Quadrilateral.java
* Implements an abstract class for Quadrilateral which implements the Polygon interface
* Lab 4.1
*/


abstract class Quadrilateral implements Polygon
{
    private int numSides;

    /**
     * Constructor for an arbitrary quadrilateral
     */
    public Quadrilateral()
    {
        this.numSides = 4; // all quadrilaterals have 4 sides
    }

    /*
    Getters
     */
    public int getNumSides()
    {
        return numSides;
    }

    @Override
    public String toString()
    {
        return "Quadrilateral{" +
                "numSides=" + numSides +
                '}';
    }
}
