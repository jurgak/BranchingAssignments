package com.company;

import java.util.Scanner;

public class switch2ExamEvaluation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter exam grade letter:");
        char grade = input.next().charAt(0);
        switch (grade) {
            case 'A', 'B' -> System.out.println("Perfect! You are so clever!");
            case 'C' -> System.out.println("Good! But you can do better!");
            case 'D', 'E' -> System.out.println("It is not good! You should study!");
            case 'F' -> System.out.println("Fail! You need to repeat the exam!");
            default -> System.out.println("Please use one of the following capital letters: A, B, C, D, E, or F");
        }

    }
}
