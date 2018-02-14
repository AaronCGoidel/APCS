package com.AaronCGoidel.APCS.labs.lab4;

public class Square extends Rectangle
{
    public Square(double length)
    {
        super(length, length);
    }

    @Override
    public double getArea()
    {
        return Math.pow(getLength(), 2);
    }

    @Override
    public double getPerimeter()
    {
        return 4 * getLength();
    }
}
