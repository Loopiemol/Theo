package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How's the weather today??");

        Scanner scanner = new Scanner(System.in);
        String weather = scanner.nextLine();

        if(weather.equalsIgnoreCase("Sunny")){
            System.out.println("It's a great day for outdoor activities!");
        }
        else if(weather.equalsIgnoreCase("Cloudy")){
            System.out.println("The weather is a bit uncertain.");
        }
        else if(weather.equalsIgnoreCase("Rainy")){
            System.out.println("Don't forget your umbrella!");
        }
        //doesn't have else if because this is for everything else
        else {
            System.out.println("Sorry, Im not sure that is a weather type.");
        }
    }

}