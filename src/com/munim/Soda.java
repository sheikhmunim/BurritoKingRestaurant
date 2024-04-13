package com.munim;

public class Soda {

    private static double price = 2.50;

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
