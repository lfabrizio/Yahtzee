package com.fabrizio;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Die {

    private int diceSides = 6;
    private int diceValue;

    //constructor
    public Die() {
        diceValue = 1;
    }

    // A Dice Value Method
    public void Value(Random random) {
        diceValue = random.nextInt(diceSides) + 1;
    }

    // Get Dice value after roll
    public int getDiceValue() {
     //   System.out.println(diceValue);
        return diceValue;
    }
    // Probably NOT needed
    //public void setValue(int diceValue){
    // this.diceValue=diceValue;
    //}
}




