package org.example;
import java.math.BigDecimal;


public class Main {
    private static final BigDecimal USD_TO_EUR_RATE = new BigDecimal("0.85");

    private static final BigDecimal GBP_TO_JPY_RATE = new BigDecimal("150");

    public static void main(String[] args) {
        System.out.println("Welcome to the currency converter");

        //THis is a us dollar
        //THis is euro
        //1 US dollar  = 0.85 Euro
        //2 US dollar = 0.85 * 2
        //sout will be this amounf of euros

        // BigDecimal usdollar = BigDecimal.valueOf(6);
        // BigDecimal euro = BigDecimal.valueOf(0.85);
        // BigDecimal converter = usdollar.multiply(euro);
        // System.out.println(converter);

        // Call the hello method to see the output
        hello(args);
    }




    public static void hello(String[] args) {

        BigDecimal usdollars = new BigDecimal("2");
        BigDecimal converter = usdollars.multiply(USD_TO_EUR_RATE);
        System.out.println("US dollars to Euros " + converter);

        usdollars = new BigDecimal("2");
         converter = usdollars.multiply(GBP_TO_JPY_RATE);
        System.out.println("US dollars to JPY " + converter);
    }




}