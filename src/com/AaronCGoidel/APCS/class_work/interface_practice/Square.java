package com.AaronCGoidel.APCS.class_work.interface_practice;

public class Square implements Polygon
{
    int sideLength;

    @Override
    public double area()
    {
        return sideLength * sideLength;
    }

    @Override
    public double perimeter()
    {
        return 4 * sideLength;
    }

    @Override
    public int getSides()
    {
        return 4;
    }

    @Override
    public boolean isRegular()
    {
        return true;
    }
}
