package com.AaronCGoidel.APCS.labs.lab4;

/*
* Aaron Goidel
* February 26, 2018
* RightTriangle.java
* Adds Right Triangle as a subclass of Triangle
* Lab 4.1
*/


import com.AaronCGoidel.APCS.labs.lab4.turtle.Turtle;

public class RightTriangle extends Triangle
{
    private Turtle t;

    public RightTriangle(double legA, double legB, double hypotenuse, Turtle t)
    {
        super(legA, legB, hypotenuse); // construct a standard triangle from side lengths
        this.t = t;
    }

    @Override
    /**
     * Check if the sides make a valid right triangle
     * true if the sides of the triangle follow A^2 + B^2 = C^2
     */
    public boolean isValid()
    {
        return Math.pow(getSideA(), 2) + Math.pow(getSideB(), 2) == Math.pow(getSideC(), 2);
    }

    @Override
    /**
     * Use turtle to draw shape
     */
    public void draw()
    {
        if(isValid()){ // only draw if the shape is valid
            t.goForward(getSideB() / 30);
            t.turnLeft(90);
            t.goForward(getSideA() / 30);
            // calculate angle by taking arccos of recently drawn side and hypotenuse
            t.turnLeft(180 - Math.toDegrees(Math.acos(getSideA() / getSideC())));
            t.goForward(getSideC() / 30);
        }else {
            System.out.println("Invalid Right Triangle");
        }
    }

    /**
     * Calculate area
     */
    public double getArea()
    {
        return (getSideA() * getSideB()) / 2;
    }

    @Override
    /**
     * Calculate perimeter
     */
    public double getPerimeter()
    {
        return getSideA() + getSideB() + getSideC();
    }

    @Override
    public String toString()
    {
        return "RightTriangle{} is-a -> " + super.toString();
    }
}
