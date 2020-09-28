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
                var die = new Die();
                dice.add(die);
            }
        }
        // roll the whole players hand
        public void roll(Random rand){
            for(var die : dice){
                die.roll(rand);
            }
        }
        // overloading , this will roll at that index if number is submitted. choice will be the index
        public void roll(Random rand, int choice){
        dice.get(choice).roll(rand);
        }
        // lets display the hand
        public void displayHand(){
        //display
        }

        public void reRoll(Random rand){
            // prompt to reroll
        }


    }