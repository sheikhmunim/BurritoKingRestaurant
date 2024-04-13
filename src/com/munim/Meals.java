package com.munim;

public class Meals {

    public static int prepTime = 17;

    public static String getName(){
        return "Meals";
    }
    public static double getPrice(){
        double meals = (Burrito.getPrice()-1)+(Fries.getPrice()-1)+(Soda.getPrice()-1);
        return meals;
    }

    public static int preparationTime(){
        return prepTime;
    }
}
