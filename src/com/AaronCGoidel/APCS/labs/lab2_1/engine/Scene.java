package com.AaronCGoidel.APCS.labs.lab2_1.engine;

import java.util.Arrays;
import java.util.Scanner;

public class Scene
{
    private String prompt;
    private Option options[];
    private Scanner in = new Scanner(System.in);


    public Scene(String prompt)
    {
        this.prompt = prompt;
        this.options = new Option[0];
    }

    /**
     * Appends a new option to the end of the options array
     * @param toAdd Option to be appended
     */
    public void addOption(Option toAdd)
    {
        options = Arrays.copyOf(options, options.length + 1);
        options[options.length - 1] = toAdd;
    }

    /**
     * Checks to see if a user has entered in a valid option.
     * Simply checks to see if a number is in between 1 and n (inclusive)
     * @param choice User's numeric selection
     * @param maxChoice Number of possible choices
     * @return boolean Whether or not the selection is valid
     */
    private boolean isValidOption(int choice, int maxChoice)
    {
        return choice > 0 && choice <= maxChoice;
    }

    /**
     * Prints all of the options out to the user
     */
    private void deliverOptions()
    {
        int counter = 0;
        for(Option choice : options){
            counter++;
            System.out.println("#" + counter + " " + choice.getText());
        }
    }

    /**
     * Takes in the users choice, validates it, and returns the correct next stage of the game
     * @return Scene The scene which corresponds to the option the user chose
     */
    private Scene takeResponse()
    {
        System.out.println("Enter the number which corresponds to the option you would like to choose");
        System.out.println("> ");

        int choice = in.nextInt();

        if(isValidOption(choice, options.length)){
            return options[choice].getNextScene();
        }else{
            return null;
        }
    }
    
    public Scene deliverPrompt()
    {
        System.out.println(prompt);
        deliverOptions();
        return takeResponse();
    }



}
