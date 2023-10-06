package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your current age? Please enter a whole number?");
        int numberOfDays = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the pick-up date? Type like this: Month/Day/Year");
        String pickUpDate = scanner.nextLine();

        System.out.println("How many days will you be keeping the car for?");
        double number0fDays = scanner.nextDouble();
        scanner.nextLine();

        double ageFee = numberOfDays * .30;
        if (numberOfDays < 25) {
            System.out.println("You have to pay a fee. Sorry.");
        } else {
            System.out.println("You don't have to pay a fee!");

        }

        System.out.println("Do you want an electronic toll tag at $3.95 a day?");
        String tollTag = scanner.nextLine();
        tollTag = tollTag.toLowerCase();
        double tollTagfee = 0;
        switch (tollTag) {
            case "yes":
                tollTagfee = numberOfDays * 3.95;
                break;
            case "no":
                break;


        }

        System.out.println("Do you want a GPS at $2.95 a day?");
        String gps = scanner.nextLine();
        gps = gps.toLowerCase();
        switch (gps) {
            case "yes":
                double gpsFee = numberOfDays * 2.95;
                break;
            case "no":
                break;


        }

        System.out.println("Do you want roadside assistance at $3.95 a day?");
        String roadSideAssistance = scanner.nextLine();
        roadSideAssistance = roadSideAssistance.toLowerCase();
        double roadSideAssistanceFee = 0;
        switch (roadSideAssistance) {
            case "yes":
                roadSideAssistanceFee = numberOfDays * 3.95;
                break;
            case "no":
                break;


        }

        double basePrice = 29.99 * numberOfDays;
        double tollTagfeezero = 0;
        double gpsFeezeroe = 0;
        double roadSideAssistanceFeezero = 0;

        double totalCost = basePrice + ageFee + tollTagfee + tollTagfeezero + gpsFeezeroe + roadSideAssistanceFee + roadSideAssistanceFeezero;
        System.out.printf("Your pick-up date is %s. Your total is $%.2f dollars%n", pickUpDate, totalCost);
    }
}