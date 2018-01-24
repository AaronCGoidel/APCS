package com.AaronCGoidel.APCS.class_work.inheritance;
/* MultipleChoice
 * AP CS A
 */
import java.util.*;

public class MultipleChoice extends Question{
	
	private ArrayList<String> choices;

	//default MC constructor which invokes super()
	MultipleChoice(){
		super(); 
		//invoking the parameterless superclass constructor
		choices = new ArrayList<String>();
	}
	MultipleChoice(String text, String answer){
		super(text, answer); 
		//invoking the parameterless superclass constructor
		choices = new ArrayList<String>();
	}
	//add choice to the ArrayList choices and set answer
	public void addChoice(String choice, boolean correct){
		choices.add(choice);
		if (correct) {setAnswer(this.getLetter(choice));}
	}

	//get the letter for the choice when it is added
	private String getLetter(String choice){
		int index = choices.indexOf(choice);
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return letters.substring(index, index+1);
	}
	
	//overloaded checkAnswer that takes a char
	public boolean checkAnswer(char response){
		return checkAnswer(String.valueOf(response));
	}
	@Override
	public void display(){
		super.display();
		for (String choice: choices){
			System.out.println(getLetter(choice)+ ". " + choice);
		}
	}
}








