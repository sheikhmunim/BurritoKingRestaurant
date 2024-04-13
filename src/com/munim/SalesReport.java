package com.munim;
import java.util.HashMap;
import java.util.Map;
public class SalesReport {
    public static Map<String, Double> sales = new HashMap<>();

    public static void recordSale(String item, int quantity, double price) {
        sales.put(item, sales.getOrDefault(item, 0.0)+ price*quantity);
    }

    public static double calculateTotal(){
       double total =  sales.values().stream().mapToDouble(Double::doubleValue).sum();
       System.out.println("Total Sales: " + total);
       return total;

    }
    public static void printReport() {
        sales.forEach((item, total) -> System.out.println(item + " sold for total $" + total));
    }

}
