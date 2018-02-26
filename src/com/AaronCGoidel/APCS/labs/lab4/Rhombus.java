package com.AaronCGoidel.APCS.labs.lab4;

/*
* Aaron Goidel
* February 26, 2018
* Rhombus.java
* Adds Rhombus as a Quadrilateral
* (Was going to be a trapezoid but that was seriously difficult)
* Lab 4.1
*/


import com.AaronCGoidel.APCS.labs.lab4.turtle.Turtle;

public class Rhombus extends Quadrilateral
{
    private Turtle t;
    private double length;
    private double angleA;
    private double angleB;

    public Rhombus(double length, double angleA, double angleB, Turtle t)
    {
        super(); // call constructor for quadrilateral
        this.t = t;
        this.length = length;
        this.angleA = angleA;
        this.angleB = angleB;
    }

    @Override
    /**
     * Use turtle to draw shape
     */
    public void draw()
    {
        t.goForward(length/30); // scale back by 1/30th
        t.turnLeft(angleA); // rotate by angleA
        t.goForward(length/30);
        t.turnLeft(angleB); // rotate by angleB
        t.goForward(length/30);
        t.turnLeft(angleA);
        t.goForward(length/30);
        t.turnLeft(angleB);

    }

    @Override
    /**
     * Calculate area
     */
    public double getArea()
    {
        // Rhombuses are tilted squares so find area of a square with the same side lengths
        // and shift by a factor of the sine of an interior angle
        return Math.pow(length, 2) * Math.sin(Math.toRadians(angleA));
    }

    @Override
    /**
     * Calculate perimeter
     */
    public double getPerimeter()
    {
        return length * 4; // 4 equal sides
    }

    @Override
    public String toString()
    {
        return "Rhombus{" +
                "length=" + length +
                ", angleA=" + angleA +
                ", angleB=" + angleB +
                "} is-a -> " + super.toString();
    }
}
