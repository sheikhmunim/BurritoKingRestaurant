package com.munim;

public class Fries {
    private static double price = 4.0;
    private static int friesInventory = 10;

    private static final int preparationTime = 8;

    public static int getPreparationTime(){
        return preparationTime;
    }

    public static String getName(){
        return "Fries";
    }

    public static double getPrice() {
        return price;
    }

    public static int getFriesInventory(){
        return friesInventory;
    }

    public static void updateInventory(int quantity){
        int updated = friesInventory - quantity;
        friesInventory = updated;

    }

    public static void setPrice(double newPrice){
        price= newPrice;
    }
    public static void cookFries(int quantity) {
        int batches = (int) Math.ceil(quantity / 5.0);
        int newFriesInventory = batches * 5;
        friesInventory = newFriesInventory;
        System.out.println("Cafe needs to cook some more, Please wait, Cooking " + newFriesInventory + " serving of fries.");

    }

}
