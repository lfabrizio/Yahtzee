package com.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
    // console class
    static Scanner scanner = new Scanner(System.in);
   static public void welcome(String gameChoice) {

       System.out.print("Welcome to " + gameChoice);
       System.out.println("\n");
   }


    static public void showRoll(List<Die> dice){
        System.out.print("*****Player's Roll*****");
        System.out.println("\n");

        for(var die : dice){
            System.out.print(die.getDiceValue() + " ");
        }
        System.out.println("\n**********************\n");
    }

    static public void log(String output)
    {
        System.out.println(output);
    }
    static public void log(int output){

        System.out.println(output);
    }


    static public List<Integer> getChoices() {
        System.out.print("Which Die Would You Like to Roll?");
        String input = scanner.nextLine();
            //need to split spaces
        String[] inputArray = input.split(" ");
        List <Integer> choices = new ArrayList<Integer>();
                for (String number : inputArray){
                    choices.add(Integer.parseInt(number) - 1);
                }
           
                return choices;
    }

}
