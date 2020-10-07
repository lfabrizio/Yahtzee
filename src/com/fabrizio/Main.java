package com.fabrizio;

import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
      Random rand = new Random();
     YahtzeeConsole.startGame();
      Player play = new Player();

      play.roll(rand);
     YahtzeeConsole.displayHand(play.getDice());
     List<Integer> choices = YahtzeeConsole.getChoices();
     play.roll(rand, choices);
     YahtzeeConsole.displayHand(play.getDice());

     //play.roll(rand, YahtzeeConsole.getChoice());
       // YahtzeeConsole.displayHand(play.getDice());
       //play.roll(rand , YahtzeeConsole.getChoices());


    }
}
