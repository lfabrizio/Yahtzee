package com.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class YahtzeeConsole extends Console{
    public YahtzeeConsole() {
        // empty constructor

    }

    public void playGame() {
        Console.welcome("Yahtzee");
        Random random = new Random();
        Player play = new Player(5);
        play.Roll(random);
       Console.showRoll(play.getDice());
        // implement user choice for re-roll
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
