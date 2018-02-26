package com.AaronCGoidel.APCS.labs.lab4;

/*
* Aaron Goidel
* February 26, 2018
* Rectangle.java
* Implements Rectangle as a subclass of Quadrilateral
* Lab 4.1
*/


import com.AaronCGoidel.APCS.labs.lab4.turtle.Turtle;

public class Rectangle extends Quadrilateral
{
    private double length;
    private double width;
    private Turtle t;

    /**
     * Constructor for Rectangle
     * @param length double Horizontal length
     * @param width double Vertical length
     * @param t Turtle
     */
    public Rectangle(double length, double width, Turtle t)
    {
        super(); // call constructor for quadrilateral
        this.length = length;
        this.width = width;
        this.t = t;
    }

    @Override
    /**
     * Calculate area
     */
    public double getArea()
    {
        return length * width;
    }

    @Override
    /**
     * Calculate perimeter
     */
    public double getPerimeter()
    {
        return (2 * length) + (2 * width);
    }

    @Override
    /**
     * Use turtle to draw shape to screen
     */
    public void draw()
    {
        for(int s = 0; s < getNumSides()/2; s++){ // draw one length and one width at a time
            t.goForward(length/30); // scale back by 1/30th
            t.turnLeft(-90);
            t.goForward(width/30);
            t.turnLeft(-90);
        }
    }

    /*
    Getters and Setters
     */
    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    @Override
    public String toString()
    {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                "} is-a -> " + super.toString();
    }
}
