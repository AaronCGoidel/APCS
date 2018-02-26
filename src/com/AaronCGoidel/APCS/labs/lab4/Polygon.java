package com.AaronCGoidel.APCS.labs.lab4;

/*
* Aaron Goidel
* February 26, 2018
* Polygon.java
* Interface for all polygons
* Lab 4.1
*/


public interface Polygon
{
    void draw(); // draw the shape
    int getNumSides(); // return the number of sides
    double getArea(); // calculate the area of the shape
    double getPerimeter(); // calculate the perimeter of the shape
}
