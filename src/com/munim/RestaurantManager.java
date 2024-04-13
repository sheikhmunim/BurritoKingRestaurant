package com.munim;

import java.util.Scanner;

import static com.munim.Fries.cookFries;

/***
 * This is admin class, all the main functionality of the code can be controlled from here
 * This class contains all the methods for ordering the item
 * Also the price update method belongs to this class
 */

public class RestaurantManager {

    public static void orderBurrito(int quantity){
        double burrito = quantity*Burrito.getPrice();
        System.out.println("Ordered " + quantity + " Burrito for $ " + burrito);

    }

    public static void orderSoda(int quantity){
        double soda = quantity*Soda.getPrice();
        System.out.println("Ordered " + quantity + " Soda for $" + soda);
    }

    /***
     * This method deals with ordering Fries, if the quantity of the fries serving
     * is less than the Fries that is stocked in inventory, it will order the serving
     * otherwise it will cook fries
     * @param quantity for number of serving of fries
     */

    public static void orderFries(int quantity) {
        if (Fries.getFriesInventory() >= quantity) {
            Fries.updateInventory(quantity);
            double total = Fries.getPrice() * quantity;
            System.out.println("Ordered " + quantity + " serving(s) of fries for a total of $" + total);
        } else {
            int friesToCook = quantity - Fries.getFriesInventory(); //it will calculate how many serving need to be cooked
            Fries.cookFries(friesToCook); //if the quantity is not enough than cookFries method will cook batch of 5 serving
            double total = Fries.getPrice() * quantity;
            System.out.println("Ordered " + quantity + " serving(s) of fries for a total of $" + total);
        }
    }

    public static void orderMeals(int quantity){
        double discountedMeals = Meals.getPrice()*quantity;
        System.out.println("Ordered " + quantity + " Meals for a total of $" + discountedMeals);

    }

    /***
     * This method used for updating the price of items
     */

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


}
