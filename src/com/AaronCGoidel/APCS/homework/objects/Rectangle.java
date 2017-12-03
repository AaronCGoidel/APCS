package com.AaronCGoidel.APCS.homework.objects;

public class Rectangle
{
    private double sideA;
    private double sideB;
    private double area;
    private double perimeter;
    private double diagonal;
    private boolean isSquare;
    private double diagonalAngleA;
    private double diagonalAngleB;

    public Rectangle(double sideA, double sideB)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.area = sideA * sideB;
        this.perimeter = 2 * sideA + 2 * sideB;
        this.diagonal = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        this.isSquare = sideA == sideB;
        this.diagonalAngleA = Math.atan(sideB/sideA);
        this.diagonalAngleB = Math.atan(sideA/sideB);
    }

    public String toString()
    {
        return String.format("length: %.2f, width: %.2f", sideA, sideB);
    }

    public double getSideA()
    {
        return sideA;
    }

    public double getSideB()
    {
        return sideB;
    }

    public double getArea()
    {
        return area;
    }

    public double getPerimeter()
    {
        return perimeter;
    }

    public boolean isSquare()
    {
        return isSquare;
    }

    public double getDiagonal()
    {
        return diagonal;
    }

    public double getDiagonalAngleA()
    {
        return Math.toDegrees(diagonalAngleA);
    }

    public double getDiagonalAngleB()
    {
        return Math.toDegrees(diagonalAngleB);
    }

    public boolean isSimilarTo(Rectangle other)
    {
        return diagonal == other.diagonal;
    }
}
