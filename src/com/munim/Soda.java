package com.munim;

public class Soda {

    private static double price = 2.50;

    private static final int preparationTime = 0;

    public static int getPreparationTime(){
        return preparationTime;
    }

    public static String getName(){
        return "Soda";
    }

    public static double getPrice(){

        return price;
    }

    public static void setPrice(double newPrice){

        price = newPrice;
    }

}
