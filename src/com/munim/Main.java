//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.munim;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice = 0;

            while (choice!=4) {
                System.out.println("=======================================");
                System.out.println("Burrito King");
                System.out.println("=======================================");
                System.out.println("\nMenu:");
                System.out.println("1. Order");
                System.out.println("2. Show sales report");
                System.out.println("3. Update Prices");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");


        try{

                choice = scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.nextLine();
        }
                switch (choice) {
                    case 1:
                        int selection = 0;
                        while (selection!=5) {
                            System.out.println(">Select the food item");
                            System.out.println("1. Burrito");
                            System.out.println("2. Fries");
                            System.out.println("3. Soda");
                            System.out.println("4. Meal");
                            System.out.println("5. No more");
                            System.out.println("Please Select: ");

                            try {
                                selection = scanner.nextInt();

                            } catch (Exception e) {
                                System.out.println("Invalid input. Please enter an integer.");
                                // Clear the scanner's buffer to prevent an infinite loop
                                scanner.nextLine();
                            }
                            switch (selection) {
                                case 1:
                                    System.out.println("How many burritos would you like to buy:");
                                    int burritoQuantity = scanner.nextInt();
                                    RestaurantManager.orderBurrito(burritoQuantity);
                                    SalesReport.recordSale(Burrito.getName(), burritoQuantity, Burrito.getPrice());
                                    PreparationTime.recordTime(Burrito.getName(),burritoQuantity, Burrito.getPrparationTime());
                                    break;
                                case 2:
                                    System.out.print("Enter number of servings for Fries: ");
                                    int friesQuantity = scanner.nextInt();
                                    RestaurantManager.orderFries(friesQuantity);
                                    SalesReport.recordSale(Fries.getName(), friesQuantity, Fries.getPrice());
                                    PreparationTime.recordTime(Fries.getName(),friesQuantity,Fries.getPreparationTime());
                                    break;
                                case 3:
                                    System.out.println("How many Soda would you like to buy");
                                    int sodaQuantity = scanner.nextInt();
                                    RestaurantManager.orderSoda(sodaQuantity);
                                    SalesReport.recordSale(Soda.getName(), sodaQuantity, Soda.getPrice());
                                    PreparationTime.recordTime(Soda.getName(),sodaQuantity,Soda.getPreparationTime());
                                    break;

                                case 4:
                                    System.out.println("How many Meals would you like to buy(Get 1 dollar Discount with each meal item)");
                                    int mealsQuantity = scanner.nextInt();
                                    RestaurantManager.orderMeals(mealsQuantity);
                                    SalesReport.recordSale(Meals.getName(),mealsQuantity,Meals.getPrice());
                                    PreparationTime.recordTime(Meals.getName(),mealsQuantity,Meals.preparationTime());
                                    break;

                                case 5:
                                    SalesReport.handlePayment(SalesReport.calculateTotal());
                                    PreparationTime.totalTime();
                                    break;
                            }
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
//                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");

                }


            }
        }
    }
