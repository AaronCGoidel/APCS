package com.AaronCGoidel.APCS.labs.lab4;

/*
* Aaron Goidel
* February 26, 2018
* EquilateralTriangle.java
* Implements Equilateral Triangle as a subclass of Triangle
* Lab 4.1
*/

import com.AaronCGoidel.APCS.labs.lab4.turtle.Turtle;

public class EquilateralTriangle extends Triangle
{
    private Turtle t;

    /**
     * Constructor for an Equilateral Triangle
     * @param length double Length of each side of the triangle (all the same since it is equilateral)
     * @param t Turtle The turtle to draw the shape
     */
    public EquilateralTriangle(double length, Turtle t)
    {
        super(length, length, length); // construct a triangle using the same length for each side
        this.t = t;
    }

    @Override
    /**
     * Draws the shape to the screen using turtle
     */
    public void draw()
    {
        // repeat steps for each side as they are all the same
        for(int side = 0; side < getNumSides(); side++){
            t.goForward(getSideA()/30); // scale side length back by 1/30th scale
            t.turnLeft(120); // all exterior angles in an equilateral triangle are 120
        }

    }

    @Override
    /**
     * Calculates the area of the triangle
     */
    public double getArea()
    {
        return Math.pow(getSideA(), 2.0) * Math.sqrt(3)/4;
    }

    @Override
    /**
     * Calculates the perimeter of the triangle
     */
    public double getPerimeter()
    {
        return getSideA() * 3; // each side is the same so simply multiply by 3
    }

    @Override
    public String toString()
    {
        return "EquilateralTriangle{} is-a -> " + super.toString();
    }
}
