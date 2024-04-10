//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.munim;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Order Burrito");
                System.out.println("2. Order Fries");
                System.out.println("3. Order Soda");
                System.out.println("4. Update Prices");
                System.out.println("5. Produce Sales Report");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        RestaurantManager.orderBurrito();
                        break;
                    case 2:
                        System.out.print("Enter number of servings for Fries: ");
                        int friesQuantity = scanner.nextInt();
                        RestaurantManager.orderFries(friesQuantity);
                        break;
                    case 3:
                        RestaurantManager.orderSoda();
                        break;
                    case 4:
                        RestaurantManager.updatePrices();
                        break;
                    case 5:
                        RestaurantManager.produceSalesReport();
                        break;
                    case 6:
                        System.out.println("Exiting the system. Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");

                }


            }
        }
    }
