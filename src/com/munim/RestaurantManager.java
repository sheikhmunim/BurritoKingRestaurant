package com.munim;

import java.util.Scanner;

public class RestaurantManager {

    private static int friesRemaining = 0;

    public static void orderBurrito(){
        System.out.println("Ordered 1 for $ " + Burrito.getPrice());

    }

    public static void orderSoda(){

        System.out.println("Ordered 1 for $" + Soda.getPrice());
    }

    public static void orderFries(int servings){
        if(servings <= Fries.getServings()){
            System.out.println("Ordered"+ servings + "servings of fries for $"+ servings*Fries.getPrice());
            Fries.cookFries();
            orderFries(servings);
        }
        else {
            System.out.println( servings +" "+ "Fries served and the bill is" +" "+ servings*Fries.getPrice());
        }
    }

    public static void updatePrices(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new price for burrito: $");
        Burrito.setPrice(scanner.nextDouble());
        System.out.println("Enter new price for fries: $");
        Fries.setPrice(scanner.nextDouble());
        System.out.println("Enter new price for Soda: $");
        Soda.setPrice(scanner.nextDouble());
        System.out.println("Price update Successfully");
    }

    public static void produceSalesReport(){
        System.out.println("== Sales Report ==");
        System.out.println("Total sold");
    }










}
