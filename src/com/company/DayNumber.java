package com.company;

import java.util.Calendar;
import java.util.Scanner;
import java.util.Locale;

public class DayNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please write which year you are interested in");
        int year = input.nextInt();
        System.out.println("The day number is:");
        int dayNumber = input.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.DAY_OF_YEAR, dayNumber);
        System.out.println("It is:" + cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH));
    }
}

