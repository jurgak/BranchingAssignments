package com.company;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many working hours in a day?");
        int workingHoursInDay = input.nextInt();
        if (workingHoursInDay > 0 && workingHoursInDay <= 8) {
            System.out.println("Salary is: " + workingHoursInDay*10 + " EUR");
        } else {
            if (workingHoursInDay > 8 && workingHoursInDay < 24) {
                System.out.println("Salary is: " + (80 + (workingHoursInDay-8)*15) + " EUR");
            }
        }
    }
}
