package com.AaronCGoidel.APCS.labs.lab4;

public class Rectangle extends Quadrilateral
{
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea()
    {
        return length * width;
    }

    @Override
    public double getPerimeter()
    {
        return (2 * length) + (2 * width);
    }

    @Override
    public void draw()
    {

    }

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
}
