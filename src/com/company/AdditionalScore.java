package com.company;

import java.util.Scanner;

public class AdditionalScore {
    public static void main(String[] args){
        displayHighScorePosition();
    }
    public static void displayHighScorePosition() {
        String name = "name";
        System.out.println("what's the score?");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        int position = calculateHighScorePosition(score);
        System.out.println(name + " managed to get position " + position + " on the high score");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500) {
            return 2;
        } else if (score > 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
