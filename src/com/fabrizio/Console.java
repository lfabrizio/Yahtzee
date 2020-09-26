package com.fabrizio;

import java.util.Scanner;

public class Console {
    // console class
    Scanner in = new Scanner(System.in);

    public void userPrompt(){
        for(int i = 0; i < 3; i++){
            System.out.println("roll again?");
            String response = in.nextLine();
        }
    }
}
