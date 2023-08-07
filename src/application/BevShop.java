/*
 * Class: CMSC203 
 * Instructor:Grinberg
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
import java.util.ArrayList;

public class BevShop implements BevShopInterface {
    private int numOfAlcoholInOrder;
    private int currentOrderIdx;
    private ArrayList<Order> orders;

    public BevShop() {
        orders = new ArrayList<>();
    }
    public boolean isValidTime(int time) {
        if (time >= MIN_TIME && time <= MAX_TIME) {
            return true;
        }
        return false;
    }
    public int getMaxNumOfFruits() {
        return MAX_FRUIT;
    }
    public int getMinAgeForAlcohol() {
        return MIN_AGE_FOR_ALCOHOL;
    }
    public boolean isMaxFruit(int num) {
        if (num > MAX_FRUIT) {
            return true;
        }
        return false;
    }
    public boolean isEligibleForMore() {
        if (numOfAlcoholInOrder < 3) {
            return true;
        }
        return false;
    }
    public int getNumOfAlcoholDrink() {
        return numOfAlcoholInOrder;
    }
    public boolean isValidAge(int age) {
        return age >= MIN_AGE_FOR_ALCOHOL;
    }
    public void startNewOrder(int time, Day day, String customerName, int customerAge) {
        Customer customer = new Customer(customerName, customerAge);
        Order order = new Order(time, day, customer);
        orders.add(order);
        currentOrderIdx = orders.indexOf(order);
        numOfAlcoholInOrder = 0;
    }
    public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        orders.get(currentOrderIdx).addNewBeverage(bevName, size, extraShot, extraSyrup);
    }
    public void processAlcoholOrder(String bevName, Size size) {
        orders.get(currentOrderIdx).addNewBeverage(bevName, size);
        numOfAlcoholInOrder++;
    }
    public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
        orders.get(currentOrderIdx).addNewBeverage(bevName, size, numOfFruits, addProtein);
    }
    public int findOrder(int orderNo) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNo() == orderNo) {
                return i;
            }
        }

        return -1;
    }
    public double totalOrderPrice(int orderNo) {
        double orderSale = 0;

        for (Order o : orders) {
            if (o.getOrderNo() == orderNo) {
                for (Beverage b : o.getBeverages()) {
                    orderSale += b.calcPrice();
                }
            }
        }

        return orderSale;
    }
    public double totalMonthlySale() {
        double totalSale = 0;

        for (Order o : orders) {
            for (Beverage b : o.getBeverages()) {
                totalSale += b.calcPrice();
            }
        }

        return totalSale;
    }
    public int totalNumOfMonthlyOrders() {
        return orders.size();
    }
    public Order getCurrentOrder() {
        return orders.get(currentOrderIdx);
    }
    public Order getOrderAtIndex(int index) {
        return orders.get(index);
    }
    public void sortOrders() {
        for (int i = 0; i < orders.size() - 1; i++) {
            int minOrderNumIdx = i;
            for (int j = i + 1; j < orders.size(); j++) {
                if (orders.get(j).getOrderNo() < orders.get(minOrderNumIdx).getOrderNo()) {
                    minOrderNumIdx = j;
                }
            }

            Order temp = orders.get(minOrderNumIdx);
            orders.set(minOrderNumIdx, orders.get(i));
            orders.set(i, temp);
        }
    }
    public boolean validAge(int age) {
        if (age >= MIN_AGE_FOR_ALCOHOL) {
            return true;
        }
        return false;
    }

    
    public int getMaxOrderForAlcohol() {
        return MAX_ORDER_FOR_ALCOHOL;
    }
    
    public String toString() {
        String sale = "Monthly Orders\n";

        for (Order o : orders) {
            sale += o.toString();
        }
        sale += "Total Sale: " + totalMonthlySale();

        return sale;
    }
  
}





