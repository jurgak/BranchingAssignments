package com.company;

public class AdditionalScore {
    public static void main(String[] args){
        displayHighScorePosition();
    }
    public static void displayHighScorePosition() {
        String name = "name";
        System.out.println(name + " managed to get position " + calculateHighScorePosition(1500) + " on the high score");
        System.out.println(name + " managed to get position " + calculateHighScorePosition(900) + " on the high score");
        System.out.println(name + " managed to get position " + calculateHighScorePosition(400) + " on the high score");
        System.out.println(name + " managed to get position " + calculateHighScorePosition(50) + " on the high score");
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
