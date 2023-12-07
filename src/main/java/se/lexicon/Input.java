package se.lexicon;

import java.util.Scanner;

public class Input {

    static int getIntInput() { return (int)getDoubleInput(); }

    static double getDoubleInput(){

        String input;
        double num = 0;
        while (true)
        {
            boolean exception = false;
            input = getInput("Input a value: ");
            try{
                num = Double.parseDouble(input);
            }catch(Exception e)
            {
                System.out.println("Error getting value, try again.");
                exception = true;
            }
            if(!exception) return num;
        }
    }

    static String getInput()
    {;
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static String getInput(String prompt)
    {;
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        String input = sc.nextLine();
        System.out.println();
        return input;
    }
}
