package com.AaronCGoidel.APCS.class_work.inheritance;
/* Question.java
 * AP CS A
 */

public class Question {
	private String text;
	private String answer;
	public static int numQuestions;
	
	//default constructor
	public Question(){
		this("","");
	}
	
	//constructor with parameters
	public Question(String text, String answer){
		this.text = text;
		this.answer = answer;
		Question.numQuestions++;
	}
	
	//mutators - set text and answer
	public void setText(String text){
		this.text = text;
	}
	
	public void setAnswer(String answer){
		this.answer = answer;
	}
	
	//check the answer given by the user
	public boolean checkAnswer(String response){
		return response.equals(answer);
	}
	
	//display the question
	public void display(){
		System.out.print(Question.numQuestions + ". ");
		System.out.println(text);
	}
	
	public static void resetQuestionNum(){
		numQuestions = 0;
	}
}
