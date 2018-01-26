package com.AaronCGoidel.APCS.homework.inheritance;

public class PenguinTester
{
    public static void main(String[] args)
    {
        Penguin percy = new Penguin();
        percy.setName("Percy");

        percy.swim();
        percy.walk();

        percy.sealAttack();
        percy.walk();

        percy.sealAttack();
        percy.walk();

    }
}
