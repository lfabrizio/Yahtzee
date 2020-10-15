package com.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {

        private List<Die> dice = new ArrayList<Die>();

        // create hand and pass in size-- loop though the size, count and add to List
        public Player(int size){
            for(int count = 0; count < size; count++){
                dice.add(new Die());
            }
        }


        // moved roll method to Player class - may make more sense
        public void Roll(Random random){
            for(var die : dice){
                die.Value(random);
            }
        }

        // overloading of method to receive specific die
        public void Roll(Random random, int specificDice){
            dice.get(specificDice).Value(random);
        }

        public void Roll(Random random, List<Integer> choices){
            for(int choice : choices){
                Roll(random, choice);
            }

        }


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


