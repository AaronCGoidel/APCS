package com.AaronCGoidel.APCS.homework.inheritance;

public class Animal {
	private String color;
	private int numOfLegs;
	
	public Animal() {
		this("", 0);
	}
		
	public Animal(String color) {
		this(color, 0);
	}
		
	public Animal(int numOfLegs) {
		this("", numOfLegs);
	}
		
	public Animal(String color, int numOfLegs) {
		this.color = color;
		this.numOfLegs = numOfLegs;
	}
		
	public void walk() {
		System.out.println("I get around somehow.");
	}
		
	public String getColor() {
		return color;
	}
		
	public void setColor(String color) {
		this.color = color;
	}
		
	public int getNumOfLegs() {
		return numOfLegs;
	}
		
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
}
