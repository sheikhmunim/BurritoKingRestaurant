package com.munim;

import java.util.Scanner;

import static com.munim.Fries.cookFries;

public class RestaurantManager {

//    public static int friesInventory = 10;
//    public static int Inventory = Fries.getFriesInventory();

    public static void orderBurrito(int quantity){
        double burrito = quantity*Burrito.getPrice();
        System.out.println("Ordered for $ " + burrito);

    }

    public static void orderSoda(int quantity){
        double soda = quantity*Soda.getPrice();
        System.out.println("Ordered for $" + soda);
    }

    public static void orderFries(int quantity) {
        if (Fries.getFriesInventory() >= quantity) {
            Fries.updateInventory(quantity);
            double total = Fries.getPrice() * quantity;
            System.out.println("Ordered " + quantity + " serving(s) of fries for a total of $" + total);
        } else {
            int friesToCook = quantity - Fries.getFriesInventory();
//            friesInventory = 0;
            cookFries(friesToCook);
            double total = Fries.getPrice() * quantity;
            System.out.println("Ordered " + quantity + " serving(s) of fries for a total of $" + total);
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
