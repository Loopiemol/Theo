package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        float firstNumber = scanner.nextFloat();
        System.out.println("Enter the second number");
        float secondNumber = scanner.nextFloat();

        System.out.println("Possible Calculations:");
        System.out.println("(A)dd:");
        System.out.println("(S)ubtract:");
        System.out.println("(M)ultiply:");
        System.out.println("(D)ivide:");

        System.out.println("Please select an option:");
        String option = scanner.next();

        if (option.equalsIgnoreCase("A")){
            float result = firstNumber + secondNumber;
            System.out.printf("%.2f + %.2f = %.2f", firstNumber, secondNumber, result);
            }
        else if (option.equalsIgnoreCase("S")) {
            float result = firstNumber - secondNumber;
            System.out.printf("%.2f - %.2f = %.2f", firstNumber, secondNumber, result);
            }
        else if (option.equalsIgnoreCase("M")) {
             float result = firstNumber * secondNumber;
            System.out.printf("%.2f * %.2f = %.2f", firstNumber, secondNumber, result);
            }
        else if (option.equalsIgnoreCase("D")) {
            float result = firstNumber / secondNumber;
            System.out.printf("%.2f / %.2f = %.2f", firstNumber, secondNumber, result);
             //doesn't have else if because this is for everything else
            }
        else {
            System.out.println("This is not a valid operation");
            }

        }

}
