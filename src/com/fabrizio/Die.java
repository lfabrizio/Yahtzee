package com.fabrizio;

import java.util.List;
import java.util.Random;
//v1.0 I have a die
// v1.1 that die can be rolled to have a random value
public class Die {
    // get the die
    //also store number of sides of the die
    private int diceSides = 6; // dice sides
    private int diceValue = 0; //to store value of dice rolled
    private int timesRolled = 0; // keep track of how many times rolled

    public void Die(int sides) {
        sides = diceSides;
        diceValue = 0;
    }

    public int roll() {
        Random random = new Random(); //random

        diceValue = random.nextInt(diceSides) + 1; // will give random number from zero to dicesides, so must add 1
        return diceValue;
    }

    public List<Die> Dice() {
        for (int i = 0; i < 6; i++) {
            //add()
//            add()
//            add()

        }


    public int getValue(){
        System.out.println(diceValue);
        return diceValue;
    }

}}