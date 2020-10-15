package com.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    private List<Die> dice = new ArrayList<Die>();

    public Player(int size) {

        for (int count = 0; count < size; count++)
            dice.add(new Die());
        // r
    }


        // fresh code , trying different approach
           public void playGame() {

               System.out.println("Welcome to Yahtzee!");
               System.out.println("Press any key to begin");
               scanner.nextLine();
               for (int count = 0; count < 5; count++) {
                   System.out.println(dice.add(new Die()));
                   dice.get(count).roll();
               }
           }


     public void roll(Random rand){
        for(var die : dice){
               //System.out.println(die.roll());

        }
    }
               // overloading , this will roll at that index if number is submitted. choice will be the index
//        public void roll(Random rand, int choice) {
//            int selection = choice -1;
//       //dice.get(selection).roll(rand);
//           // System.out.println(dice.get(findDie(choice)).roll(rand));
//        }
//    //multiple
//        public void roll(Random rand, List<Integer> choices) {
//            for (int choice : choices) {
//                 roll(rand, choice);
//            }
//        }

//        public int findDie(Die checkDie){
//            return this.dice.get(dice.indexOf(checkDie)).getValue();
//        }
               //learned gets sets not always necessary
               //public void setDice(List<Die> dice) {
               //  this.dice = dice;

//        public List<Integer> getDice(){
//            List<Integer> values = new ArrayList<>();
//            for(var die : dice) {
//                values.add(die.getValue());
//            }
//            return values;
//        }

//        // get yahtzee
//    public boolean confirmYahtzee(){
//            int yahtzee = dice.get(0).getValue();
//            for(int read = 0; read < dice.size(); read++){

//    }

}


