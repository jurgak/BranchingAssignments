package com.company;

import java.util.Scanner;

public class switch3Calculations {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter second number:");
        int number2 = input2.nextInt();
        Scanner input = new Scanner(System.in);
        int operation = selectOperator(input);
        runOperation (number1, number2, (char) operation);
    }

    static void runOperation (int number1, int number2, char operation) {
        switch (operation) {
            case '+':
                System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
                break;
            case '-':
                System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
                break;
            case '/':
                System.out.println(number1 + " / " + number2 + " = " + (number1/number2));
                break;
            case '*':
                System.out.println(number1 + " * " + number2 + " = " + (number1*number2));
                break;
            case '%':
                System.out.println(number1 + " % " + number2 + " = " + (number1%number2));
                break;
            case 'p':
                System.out.println("Your numbers: " + number1 + " & " + number2);
            case 'b':
                System.out.println((number1 > number2) ? ("number 1 is bigger") : ("number 2 is bigger"));
                break;
            case 's':
                System.out.println((number1 < number2) ? ("number 1 is smaller") : ("number 2 is smaller"));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }

        static char selectOperator(Scanner input) {
            Scanner inputChar = new Scanner(System.in);
            System.out.println("Enter + for addition");
            System.out.println("Enter - for subtraction");
            System.out.println("Enter / for division");
            System.out.println("Enter * for multiplication");
            System.out.println("Enter % for remainder");
            System.out.println("Enter p for printing both elements");
            System.out.println("Enter b for verifying which element is bigger");
            System.out.println("Enter s for verifying which element is smaller");
            System.out.println("Enter the symbol:");
            return inputChar.next().charAt(0);
        }
}
