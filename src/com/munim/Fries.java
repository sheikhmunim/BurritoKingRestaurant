package com.munim;

public class Fries {
    private static double price = 4.0;
    private static int servings = 4;

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double newPrice){

        price= newPrice;
    }

    public static int getServings(){

        return servings;
    }

    public static void addServings(int additionalServings){

        servings += additionalServings;
    }

    public static void removeServings(int servingsToRemove){

        servings -= servingsToRemove;
    }

    public static void cookFries(){
        servings +=5;
        System.out.println("5 servings of fries cooked.");
    }



}
