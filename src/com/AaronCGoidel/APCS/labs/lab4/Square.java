package com.AaronCGoidel.APCS.labs.lab4;

/*
* Aaron Goidel
* February 26, 2018
* Square.java
* Implements Square as a specialized subclass of Rectangle
* Lab 4.1
*/


import com.AaronCGoidel.APCS.labs.lab4.turtle.Turtle;

public class Square extends Rectangle
{
    public Square(double length, Turtle t)
    {
        super(length, length, t); // construct a rectangle with length and width equal to length of square
    }

    @Override
    /**
     * Specialized area formula for square
     */
    public double getArea()
    {
        return Math.pow(getLength(), 2);
    }

    @Override
    /**
     * Specialized perimeter formula for square
     */
    public double getPerimeter()
    {
        return 4 * getLength();
    }

    @Override
    public String toString()
    {
        return "Square{length=" + getLength() + "} is-a -> " + super.toString();
    }
}
