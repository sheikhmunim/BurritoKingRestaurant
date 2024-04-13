package com.munim;
import java.util.HashMap;
import java.util.Map;

public class PreparationTime {
    public static Map<String, Double> prepTime = new HashMap<>();

    public static void recordTime(String item, int quantity, double time){

            prepTime.put(item, prepTime.getOrDefault(item, 0.0)+ time);

    }
    public static double totalTime(){
        double total =  prepTime.values().stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Total Preparation time: " + total);
        return total;
    }

}
