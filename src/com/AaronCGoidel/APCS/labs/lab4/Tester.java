package com.AaronCGoidel.APCS.labs.lab4;

/*
* Aaron Goidel
* February 26, 2018
* Tester.java
* Instantiates one of each type of polygon and tests their methods and draws them
* Lab 4.1
*/


import com.AaronCGoidel.APCS.labs.lab4.turtle.Turtle;

import java.awt.*;
import java.util.ArrayList;

public class Tester
{
    public static void main(String[] args)
    {
        // create turtle to pass to shapes
        Turtle t = new Turtle(.5, .5, 0);
        t.setPenColor(Color.BLACK);
        t.setPenRadius(0.005);

        ArrayList<Polygon> shapes = new ArrayList<>();

        // add one of each shape to ArrayList
        shapes.add(new Rectangle(10, 5, t));
        shapes.add(new Square(8, t));
        shapes.add(new RightTriangle(3, 4, 5, t));
        shapes.add(new EquilateralTriangle(7, t));
        shapes.add(new Rhombus(7, 40, 140, t));

        for(Polygon shape : shapes){
            /*
            Print information about shape
             */
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Number of Sides: " + shape.getNumSides());
            System.out.println();

            t.pause(1000); // pause before drawing shape
            shape.draw(); // draw shape to screen
            t.pause(1000); // let image sit on screen

            /*
            Erase
             */
            t.setPenColor(Color.WHITE); // set pen to match background
            t.setPenRadius(2); // make pen real big
            shape.draw(); // draw over the shape in white
            t.setPenColor(Color.BLACK); // reset pen size and color
            t.setPenRadius(0.005);
        }
    }
}
