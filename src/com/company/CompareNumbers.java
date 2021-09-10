package com.company;

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter Number One");
        short numberOne = input.nextShort();
        System.out.println("please enter Number Two");
        short numberTwo = input.nextShort();
        if (numberOne == numberTwo) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println(numberOne > numberTwo ? "Number One is greater than Number Two" : "Number Two is greater than Number One");
        }
        System.out.println(numberOne % 2 == 0 ? "Number One is even" : "Number One is odd");
        System.out.println(numberTwo % 2 == 0 ? "Number Two is even" : "Number Two is odd");
        System.out.println(numberOne < 0 ? "Number One is negative" : "Number One is positive");
        System.out.println(numberTwo < 0 ? "Number Two is negative" : "Number Two is positive");
        if (numberOne < 100 && numberTwo < 100) {
            System.out.println("Two numbers are below 100");
        } else {
            if (numberOne < 100 || numberTwo < 100) {
                System.out.println("One number is below 100");
            }
        }

    }
}