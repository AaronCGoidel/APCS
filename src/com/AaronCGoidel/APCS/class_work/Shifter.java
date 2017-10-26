package com.AaronCGoidel.APCS.class_work;

public class Shifter
{
    public static char shifter(char original, int offset)
    {
        offset = offset % 26 + 26;

        if(Character.isLetter(original)){
            if(Character.isUpperCase(original)){
                return ((char) ('A' + (original - 'A' + offset) % 26));
            }else{
                return ((char) ('a' + (original - 'a' + offset) % 26));
            }
        }else{
            return (original);
        }
    }

    public static void main(String[] args)
    {
        String str = "The quick brown fox Jumped over the lazy Dog";

        for(int i = 0; i < str.length(); i++)
        {
            System.out.print(shifter(str.charAt(i), 12));
        }
    }
}
