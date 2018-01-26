package com.AaronCGoidel.APCS.homework.inheritance;

public class PenguinTester
{
    public static void main(String[] args)
    {
        Penguin percy = new Penguin();
        percy.setName("Percy");
        System.out.println(percy);

        percy.swim();
        percy.walk();

        percy.sealAttack();
        percy.walk();

        percy.sealAttack();
        percy.walk();

        System.out.println(percy);

    }
}
