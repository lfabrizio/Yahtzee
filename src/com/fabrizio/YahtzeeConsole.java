package com.fabrizio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class YahtzeeConsole extends Console{
    public YahtzeeConsole() {
        // empty constructor

    }

    public void playGame() {
        Console.welcome("Yahtzee");
        Random random = new Random();
        Player play = new Player(5);
        play.Roll(random);
       Console.showRoll(play.getDice());
        // implement user choice for re-roll
       play.Roll(random, Console.getChoices());
    }


}
