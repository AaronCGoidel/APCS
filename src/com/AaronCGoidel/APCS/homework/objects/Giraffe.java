package com.AaronCGoidel.APCS.homework.objects;

public class Giraffe
{
    private String name;
    private int age = 0;
    private int weight;
    private int avgWeight;
    private long neck;
    private String gender;

    public Giraffe(String name, int weight, long neck, String gender)
    {
        this.name = name;
        this.weight = weight;
        this.neck = neck;
        this.gender = gender;
        this.avgWeight = gender.equalsIgnoreCase("male") ? 2_600 : 1_800;
    }

    public boolean isFat()
    {
        return weight > avgWeight; // does it weight more than the average giraffe?
    }

    public void eat(int foodMass)
    {
        weight += foodMass;
    }

    private void getOlder()
    {
        age++;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getWeight()
    {
        return weight;
    }

    public long getNeck()
    {
        return neck;
    }

    public String getGender()
    {
        return gender;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
