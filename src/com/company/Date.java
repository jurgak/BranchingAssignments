package com.company;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please write the day");
        int day = input.nextInt();
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("please write the month");
        int month = inputTwo.nextInt();
        Scanner inputThree = new Scanner(System.in);
        System.out.println("please write the year");
        int year = inputThree.nextInt();
        Scanner inputFour = new Scanner(System.in);
        System.out.println("please select the date formatting: 1 - YYYY/MM/DD, 2 - DD.MM.YYYY");
        int format = inputFour.nextInt();
        if (format == 1) {
            System.out.println("Your date is " + year + "/" + month + "/" + day);
        } else {
            System.out.println("Your date is " + day + "." + month + "." + year);
        }
    }
}
