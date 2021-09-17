package com.company;

public class AdditionalScore {
    public static void main(String[] args){
        displayHighScorePosition();
    }
    public static void displayHighScorePosition() {
        String name1 = "John";
        String name2 = "Peter";
        String name3 = "Janis";
        String name4 = "Peteris";
        System.out.println(name1 + " managed to get position " + calculateHighScorePosition(1500) + " on the high score");
        System.out.println(name2 + " managed to get position " + calculateHighScorePosition(900) + " on the high score");
        System.out.println(name3 + " managed to get position " + calculateHighScorePosition(400) + " on the high score");
        System.out.println(name4 + " managed to get position " + calculateHighScorePosition(50) + " on the high score");
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
