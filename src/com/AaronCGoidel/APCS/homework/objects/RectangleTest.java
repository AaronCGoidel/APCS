package com.AaronCGoidel.APCS.homework.objects;

public class RectangleTest
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle(10, 10);
        Rectangle rect1 = new Rectangle(6, 1);
        Rectangle rect2 = new Rectangle(2, 2);

        System.out.println(rect);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Is a Square: " + rect.isSquare());
        System.out.println("Diagonal Length: " + rect.getDiagonal());
        System.out.println("Angle \'A\' of Diagonal: " + rect.getDiagonalAngleA());
        System.out.println("Angle \'B\' of Diagonal: " + rect.getDiagonalAngleB());
        System.out.println(rect + " is similar to "+ rect1 + " " + rect.isSimilarTo(rect1));
        System.out.println(rect + " is similar to "+ rect2 + " " + rect.isSimilarTo(rect2));
    }
}
