package com.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
        private List<Die> dice;

        public Player(){
            // create list , then loop through 5 dice and add all
            dice = new ArrayList<Die>();
            for (int count = 0; count < 5; count++){
                dice.add(new Die());
            }
            for(int i = 0; i < dice.size();i++){
                dice.get(i);
            }
        }
        // roll the whole players hand
        public void roll(Random rand){
            for(var die : dice){
                System.out.println(die.roll(rand));
            }
        }
        // overloading , this will roll at that index if number is submitted. choice will be the index
        public void roll(Random rand, int choice) {
            int selection = choice -1;
       //dice.get(selection).roll(rand);
            System.out.println(dice.get(findDie(choice)).roll(rand));
        }
    //multiple
        public void roll(Random rand, List<Integer> choices) {
            for (int choice : choices) {
                 roll(rand, choice);
            }

        }

        public int findDie(Die checkDie){
            return this.dice.get(dice.indexOf(checkDie)).getValue();
        }
        //learned gets sets not always necessary
        //public void setDice(List<Die> dice) {
          //  this.dice = dice;

        public List<Integer> getDice(){
            List<Integer> values = new ArrayList<>();
            for(var die : dice) {
                values.add(die.getValue());
            }
            return values;
        }

//        // get yahtzee
//    public boolean confirmYahtzee(){
//            int yahtzee = dice.get(0).getValue();
//            for(int read = 0; read < dice.size(); read++){

//    }
        }


