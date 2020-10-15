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


//        // fresh code , trying different approach
//           will implement more user prompts
//
//               System.out.println("Welcome to Yahtzee!");
//               System.out.println("Press any key to begin");
//               scanner.nextLine();
//               for (int count = 0; count < 5; count++) {
//                   System.out.println(dice.add(new Die()));
//                   dice.get(count).roll();
//               }
//           }
}
