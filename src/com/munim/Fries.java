package com.munim;

public class Fries {
    private static double price = 4.0;
    private static int friesInventory = 20;  //by default the friesInventory is set to 20

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

    /***
     * cookFries method will cook the fries in batches
     * Match.ceil is taken to take the upper bound of the result, for example if it is 0.4 then it will be 1
     * as serving of fries should be a complete serve not in fraction
     * @param quantity this is prameter for cookFries, it should have the quantity the user selects
     */
    public static void cookFries(int quantity) {
        int batches = (int) Math.ceil(quantity / 5.0);
        int newFriesInventory = batches * 5;
        friesInventory = newFriesInventory;
        System.out.println("Cafe needs to cook some more, Please wait, Cooking " + newFriesInventory + " serving of fries.");

    }

}
