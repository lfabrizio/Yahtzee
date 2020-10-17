package com.fabrizio;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
    // console class
    static Scanner scanner = new Scanner(System.in);
    public int rounds = 1;
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




    static public List<Integer> getChoices() {
        System.out.print("Which Die Would You Like to Roll?");
        String input = scanner.nextLine();
            //need to split spaces
        String[] inputArray = input.split("");
       List <Integer> choices = new ArrayList<Integer>();
                for (String number : inputArray){
                    choices.add(Integer.parseInt(number)- 1);
                }
                return choices;
    }

    // add in rounds





}
