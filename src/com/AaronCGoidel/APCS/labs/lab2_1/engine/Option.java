package com.AaronCGoidel.APCS.labs.lab2_1.engine;

public class Option
{
    private String text;
    private Scene nextScene;

    public Option(String text, Scene nextScene)
    {
        this.text = text;
        this.nextScene = nextScene;
    }

    public String getText()
    {
        return text;
    }

    public Scene getNextScene()
    {
        return nextScene;
    }
}
