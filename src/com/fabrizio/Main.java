package com.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
     Random rand = new Random();
   //YahtzeeConsole.startGame();
    Player play = new Player();

   play.roll(rand);
        System.out.println("-------------");
   // YahtzeeConsole.displayHand(play.getDice());

       play.roll(rand, 5);

        System.out.println("-----------");
        List<Integer> choices = new ArrayList<>();
        choices.add(2);
        choices.add(4);
        play.roll(rand, choices);
       // for (int die = 0; die < play.getDice().size(); die++) {
        //    System.out.println(play.getDice().get(die));
      //  }
   // YahtzeeConsole.displayHand(play.getDice());

     //play.roll(rand, YahtzeeConsole.getChoice());
       // YahtzeeConsole.displayHand(play.getDice());
       //play.roll(rand , YahtzeeConsole.getChoices());


    }
}
