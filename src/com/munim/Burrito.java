package com.munim;

public class Burrito {
    private static double price = 7.0;
    private static final int preparationTime = 9;


    public static String getName(){
        return "Burrito";
    }

    public static double getPrice() {

        return price;
    }

    public static void setPrice(double newPrice) {

        price = newPrice;
    }

    public static int getPreparationTime(){

        return preparationTime;
    }
}
