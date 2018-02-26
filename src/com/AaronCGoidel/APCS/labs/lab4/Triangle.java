package com.AaronCGoidel.APCS.labs.lab4;

/*
* Aaron Goidel
* February 26, 2018
* Triangle.java
* Abstract class outlining a generic Triangle
* Lab 4.1
*/


public abstract class Triangle implements Polygon
{
    private int numSides;
    private double sideA, sideB, sideC;

    /**
     * Constructor for an arbitrary triangle
     * @param sideA double Length of first side
     * @param sideB double Length of second side
     * @param sideC double Length of third side
     */
    public Triangle(double sideA, double sideB, double sideC)
    {
        this.numSides = 3; // all triangles have 3 sides...
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Gets number of sides
     * @return int The number of sides in the shape
     */
    public int getNumSides()
    {
        return numSides;
    }

    /*
    GETTERS
     */
    public double getSideA()
    {
        return sideA;
    }

    public double getSideB()
    {
        return sideB;
    }

    public double getSideC()
    {
        return sideC;
    }

    /**
     * Check if the side lengths make a valid triangle
     * @return boolean Whether or not a triangle can be made
     */
    public boolean isValid()
    {
        return sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA;
    }

    @Override
    public String toString()
    {
        return "Triangle{" +
                "numSides=" + numSides +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
