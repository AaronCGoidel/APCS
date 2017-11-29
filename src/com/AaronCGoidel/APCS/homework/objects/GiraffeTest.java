package com.AaronCGoidel.APCS.homework.objects;

public class GiraffeTest
{
    public static void main(String[] args)
    {
        Giraffe longDeer = new Giraffe("Shelby", 1000, 6, "female");

        System.out.println(longDeer.getWeight());
        System.out.println(longDeer.isFat());

        longDeer.eat(850);

        System.out.println(longDeer.getWeight());
        System.out.println(longDeer.isFat());
    }
}
