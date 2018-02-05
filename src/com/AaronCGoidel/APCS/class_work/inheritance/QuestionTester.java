package com.AaronCGoidel.APCS.class_work.inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        boolean done = false;
        ArrayList<Question> quiz = new ArrayList<>();

        while(!done){
            System.out.println("Is this multiple choice? (no): ");
            if(in.nextLine().equalsIgnoreCase("yes")){
                MultipleChoice question = new MultipleChoice();

                System.out.println("Enter question text: ");
                question.setAnswer(in.nextLine());

                System.out.println("How many options are there? ");
                for(int i = 0; i < in.nextInt(); i++){
                    System.out.println("Enter option: ");
                    String option = in.nextLine();
                    System.out.println("Is this the correct answer? (no):" );
                    boolean isAnswer = in.nextLine().equalsIgnoreCase("yes");
                    question.addChoice(option, isAnswer);
                }
            }else{
                Question question = new Question();

                System.out.println("Enter question text: ");
                question.setText(in.nextLine());

                System.out.println("Enter answer: ");
                question.setAnswer(in.nextLine());
            }
            System.out.println("Done?: ");
            if(in.nextLine().equalsIgnoreCase("yes")){
                done = true;
            }
        }
        for(Question q : quiz){
            q.display();
        }
    }

    public static void present(Question q)
    {
        Scanner in = new Scanner(System.in);

        q.display();

        System.out.println("Enter your answer: ");
        if(q.checkAnswer(in.nextLine())){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
    }
}
