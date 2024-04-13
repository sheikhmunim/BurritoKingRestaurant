package com.munim;
import java.util.HashMap;
import java.util.Map;

public class PreparationTime {

    /***
     * Map to store the time for preparing food item
     * Key: name of food, Value: preparation time in minutes
     */
    public static Map<String, Double> prepTime = new HashMap<>();
    public static void recordTime(String item, int quantity, double time){
            prepTime.put(item, prepTime.getOrDefault(item, 0.0)+ time);
    }

    /***
     * Calculates the total preparation time
     * @return total time for preparation
     */

    public static double totalTime(){
        double total =  prepTime.values().stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Total Preparation time: " + total);
        return total;
    }

}
