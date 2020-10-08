package com.fabrizio;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Die {
    Scanner scan = new Scanner(System.in);
    private Random rand =new Random();
    private int diceSides = 6; // dice sides
    private int diceValue; //to store value of dice rolled
// empty constructor
    public Die() {
        diceValue = 1;
    }
//overloading
    public Die(int sides){
        diceValue = 1;
        this.diceValue = sides;
    }

    public void roll(){
        diceValue = rand.nextInt(diceSides)+ 1;

    }

    public int getValue(){
        System.out.println(diceValue);
        return diceValue;
    }

    //public void setValue(int diceValue){
       // this.diceValue=diceValue;
    }
