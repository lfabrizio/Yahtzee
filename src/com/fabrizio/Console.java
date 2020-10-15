package com.fabrizio;

import java.util.List;
import java.util.Scanner;

public class Console {
    // console class

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


//    static public int getChoice(){
//        System.out.print("which die would you like to roll? 1-5");
//        String input = scanner.nextLine();
//        return Integer.parseInt(input) -1;
//    }
//     static public List<Integer> getChoices() {
//        System.out.print("which die do you want to roll?");
//        String input = scanner.nextLine();
//        String[] inputArray = input.split(" ");
//        List <Integer> choices = new ArrayList<>();
//                for (String choice : inputArray){
//                    choices.add(Integer.parseInt(choice) - 1);
//                }
//                return choices;
//    }
}
