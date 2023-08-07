/*
 * Class: CMSC203 
 * Instructor: Grinberg
 * Description: (Give a brief description for each Class)
 * Due: 07/29/2023
 * Platform/compiler:IDE Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here:Vivek Hubbly
*/

package application;


import java.util.Scanner;

public class BevShopDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BevShop bevShop = new BevShop();

        System.out.println("The current order in process can have at most " + bevShop.getMaxOrderForAlcohol() + " alcoholic beverages.");
        System.out.println("The minimum age to order alcohol drink is " + bevShop.getMinAgeForAlcohol());
        System.out.println("Start please a new order:");

        while (true) {
            System.out.print("Would you please enter your name: ");
            String customerName = scanner.nextLine();

            System.out.print("Would you please enter your age: ");
            int customerAge = Integer.parseInt(scanner.nextLine());

            if (customerAge >= bevShop.getMinAgeForAlcohol()) {
                System.out.println("Your age is above " + (bevShop.getMinAgeForAlcohol() - 1) + " and you are eligible to order alcohol.");
            } else {
                System.out.println("Your age is not appropriate for alcohol drink!!");
            }

            bevShop.startNewOrder(12, Day.MONDAY, customerName, customerAge);

            boolean continueOrder = true;
            while (continueOrder) {
                System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

                System.out.println("Would you please add a beverage?");
                System.out.println("1. Alcohol");
                System.out.println("2. COFFEE");
                System.out.println("3. SMOOTHIE");
                System.out.println("4. Finish Order");

                int choice = Integer.parseInt(scanner.nextLine());
                String bevName;
                Size bevSize;

                if (choice == 1) {
                    if (bevShop.isEligibleForMore()) {
                        System.out.println("The current order of drinks is " + bevShop.getNumOfAlcoholDrink());
                        System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));
                        System.out.println("Your current alcohol drink order is less than " + (bevShop.getMaxOrderForAlcohol() + 1));
                        System.out.println("Would you please add an alcohol drink");
                        bevName = scanner.nextLine();
                        bevSize = Size.MEDIUM; // Assuming medium size for simplicity
                        bevShop.processAlcoholOrder(bevName, bevSize);
                    } else {
                        System.out.println("You have a maximum alcohol drinks for this order");
                    }
                } else if (choice == 2) {
                    System.out.println("Would you please add a COFFEE to your order:");
                    bevName = scanner.nextLine();
                    bevSize = Size.MEDIUM; // Assuming medium size for simplicity
                    bevShop.processCoffeeOrder(bevName, bevSize, false, false);
                } else if (choice == 3) {
                    System.out.println("Would you please add a SMOOTHIE to order:");
                    bevName = scanner.nextLine();
                    bevSize = Size.MEDIUM; // Assuming medium size for simplicity
                    System.out.println("Would you please add a drink");
                    int numOfFruits = Integer.parseInt(scanner.nextLine());
                    System.out.println("The current order of drinks is " + bevShop.getNumOfAlcoholDrink());
                    System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));
                    if (bevShop.isMaxFruit(numOfFruits)) {
                        System.out.println("You reached a Maximum number of fruits");
                    } else {
                        bevShop.processSmoothieOrder(bevName, bevSize, numOfFruits, false);
                    }
                } else if (choice == 4) {
                    continueOrder = false;
                } else {
                    System.out.println("Invalid choice!");
                }
            }

            System.out.println(bevShop.getCurrentOrder().toString());

            System.out.println("#------------------------------------#");

            System.out.print("Would you please start a new order? (yes/no): ");
            String startNewOrder = scanner.nextLine().toLowerCase();

            if (startNewOrder.equals("no")) {
                break;
            }
        }

        bevShop.sortOrders();
        System.out.println(bevShop.toString());
        System.out.println("Total amount for all Orders: " + bevShop.totalMonthlySale());

        scanner.close();
    }
}










