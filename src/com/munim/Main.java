//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.munim;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


            while (true) {
                System.out.println("=======================================");
                System.out.println("Burrito King");
                System.out.println("=======================================");
                System.out.println("\nMenu:");
                System.out.println("1. Order");
                System.out.println("2. Show sales report");
                System.out.println("3. Update Prices");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println(">Select the food item");
                        System.out.println("1. Burrito");
                        System.out.println("2. Fries");
                        System.out.println("3. Soda");
                        System.out.println("4. No more");
                        System.out.println("Please Select: ");
                        int selection = scanner.nextInt();
                        switch (selection) {
                            case 1:
                                System.out.println("How many burritos would you like to buy:");
                                int burritoQuantity = scanner.nextInt();
                                RestaurantManager.orderBurrito(burritoQuantity);
                                SalesReport.recordSale(Burrito.getName(), burritoQuantity,Burrito.getPrice());
//                                break;
                            case 2:
                                System.out.print("Enter number of servings for Fries: ");
                                int friesQuantity = scanner.nextInt();
                                RestaurantManager.orderFries(friesQuantity);
                                SalesReport.recordSale(Fries.getName(),friesQuantity, Fries.getPrice());
//                                break;
                            case 3:
                                System.out.println("How many Soda would you like to buy");
                                int sodaQuantity = scanner.nextInt();
                                RestaurantManager.orderSoda(sodaQuantity);
                                SalesReport.recordSale(Soda.getName(),sodaQuantity,Soda.getPrice());
//                                break;

                            case 4:
                            {}
                        }
                        break;
                    case 2:
                        System.out.println("--------------------------------");
                        System.out.println("Sales Summary: ");
                        System.out.println("--------------------------------");
                        SalesReport.printReport();
                        System.out.println("--------------------------------");
                        SalesReport.calculateTotal();
                        break;
                    case 3:
                        RestaurantManager.updatePrices();
                        break;
                    case 4:
                        System.out.println("Exiting the system. Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");

                }


            }
        }
    }
