package com.munim;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SalesReport {

    /***
     * Maps the items with its price and store it in sales variable
     * Key: food item name, Value: price of the food item
     */
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

    /***
     * handles the payment and return the changes
     * @param total this is a parameter for handlePayment method
     */

    public static void handlePayment(double total){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter money: ");

            double paid = 0;

            try {
                paid = Double.parseDouble(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
            if (paid < total) {
                System.out.println("Sorry, that’s not enough to pay for the order");
            } else {
                double change = paid - total;
                System.out.println("Change returned $" + change);
                break;
            }
        }
    }

}
