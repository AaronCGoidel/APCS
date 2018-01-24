package com.AaronCGoidel.APCS.class_work.inheritance;

public class QuestionTester
{
    public static void main(String[] args)
    {
        Question open_ended = new Question();

        open_ended.setText("Who was the first president of the United States?");
        open_ended.setAnswer("George Washington");

        open_ended.display();
        System.out.println(open_ended.checkAnswer("Queen Victoria"));
        System.out.println(open_ended.checkAnswer("George Washington"));

        System.out.println();
        MultipleChoice mc_question = new MultipleChoice();

        mc_question.setText("Which of the following is an element on the periodic table?");
        mc_question.addChoice("Water", false);
        mc_question.addChoice("Electron", false);
        mc_question.addChoice("Boron", true);
        mc_question.addChoice("Space Dust", false);

        mc_question.display();

        System.out.println(mc_question.checkAnswer('B'));
        System.out.println(mc_question.checkAnswer('C'));

    }
}
