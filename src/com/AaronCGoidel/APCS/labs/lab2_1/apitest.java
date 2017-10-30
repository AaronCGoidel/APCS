package com.AaronCGoidel.APCS.labs.lab2_1;

import com.AaronCGoidel.APCS.labs.lab2_1.engine.Option;
import com.AaronCGoidel.APCS.labs.lab2_1.engine.Scene;

public class apitest
{
    public static void main(String[] args)
    {
        Scene test = new Scene("test");
        Scene test2 = new Scene("2nd test");
        Scene test3 = new Scene("You are in a room");
        Option testOption = new Option("blah blah", test2);
        Option otherTest = new Option("This is an option", test3);
        test.addOption(testOption);
        test.addOption(otherTest);
        test2.addOption(otherTest);

        boolean go = true;
        Scene state = test;

        while(go){
            if(state != null){
                state = state.deliverPrompt();
            }else{
                go = false;
            }

        }

    }
}
