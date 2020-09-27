package com.fabrizio;

import java.util.List;
import java.util.Random;
//v1.0 I have a die
// v1.1 that die can be rolled to have a random value
public class Die {
    // get/create the die
    private int diceSides = 6; // dice sides
    private int diceValue = 0; //to store value of dice rolled

    public Die() {
        diceValue = 1;
    }
//overloading
    public Die(int sides){
        diceValue = 1;
        this.diceValue = sides;
    }

    public void roll(Random rand){
         diceValue = rand.nextInt(diceSides)+ 1;
    }


    public int getValue(){
        System.out.println(diceValue);
        return diceValue;
    }

}