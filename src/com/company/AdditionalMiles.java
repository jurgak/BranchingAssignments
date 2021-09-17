package com.company;

import java.util.Scanner;

public class AdditionalMiles {
    public static void main(String[] args) {
        System.out.println("how many kilometers?");
        Scanner input = new Scanner(System.in);
        double kilometersPerHour = input.nextDouble();
        System.out.println((long) toMilesperHour(kilometersPerHour));
    }

    public static double toMilesperHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return kilometersPerHour / 1.60934 ;
        }

    }
}
