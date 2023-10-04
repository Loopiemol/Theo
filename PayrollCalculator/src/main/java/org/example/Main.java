package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to to the payroll calculator!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String FirstName = scanner.nextLine();


        System.out.println("How many hours did you work?");
        double hoursWorked = scanner.nextDouble();

        System.out.println("How much do you make in an hour?");
        double payRate = scanner.nextDouble();

        double answer = hoursWorked * payRate;

        System.out.println(FirstName);
        System.out.println("Your paycheck will be:");
        System.out.println(answer);
        System.out.println("dollars");

    }
}