package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your current age? Please enter a whole number?");
        int currentAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the pick-up date? Type like this: Month/Day/Year");
        String pickUpDate = scanner.nextLine();

        System.out.println("How many days will you be keeping the car for?");
        double numberOfDays = scanner.nextDouble();
        scanner.nextLine();

        double ageFee = 0;
        if (currentAge < 25) {
            ageFee = numberOfDays * 0.30 * 29.99;
        }
        else {
            ageFee = 0;
        }

        System.out.println("Do you want an electronic toll tag at $3.95 a day?");
        String tollTag = scanner.nextLine().toLowerCase();
        double tollTagFee = 0;
        switch (tollTag) {
            case "yes":
                tollTagFee = numberOfDays * 3.95;
                break;
            case "no":
                tollTagFee = 0;
                break;

        }

        System.out.println("Do you want a GPS at $2.95 a day?");
        String gps = scanner.nextLine().toLowerCase();
        double gpsFee = 0;
        switch (gps) {
            case "yes":
                gpsFee = numberOfDays * 2.95;
                break;
            case "no":
                gpsFee = 0;
                break;

        }

        System.out.println("Do you want roadside assistance at $3.95 a day?");
        String roadSideAssistance = scanner.nextLine().toLowerCase();
        double roadSideAssistanceFee = 0;
        switch (roadSideAssistance) {
            case "yes":
                roadSideAssistanceFee = numberOfDays * 3.95;
                break;
            case "no":
                roadSideAssistanceFee = 0;
                break;
        }

        double basePrice = 29.99 * numberOfDays;
        double totalCost = basePrice + ageFee + tollTagFee + gpsFee + roadSideAssistanceFee;
        System.out.printf("Your pick-up date is %s. Your total is $%.2f dollars%n", pickUpDate, totalCost);
    }
}