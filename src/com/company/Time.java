package com.company;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your current hour in 24 hour format");
        int time = input.nextInt();
        if (time <= 12 && time >= 8) {
            System.out.println("Good Morning Sunshine!");
        } else {
            if (time >= 13 && time <= 19) {
                System.out.println("Good Afternoon. Work hard!");
            } else {
                if (time >= 20 && time <= 24) {
                    System.out.println("Good Evening. Get some rest!");
                }
                else {
                    if (time >= 0 && time <= 8){
                        System.out.println("Why not in bed yet???");
                    }
                }
            }
        }
    }
}
