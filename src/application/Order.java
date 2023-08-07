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
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order> {
    private int orderNo;
    private int orderTime;
    private Day orderDay;
    private Customer customer;
    private ArrayList<Beverage> beverages;

    public Order(int orderTime, Day orderDay, Customer cust) {
        orderNo = genOrderNum();
        this.orderTime = orderTime;
        this.orderDay = orderDay;
        customer = cust;
        beverages = new ArrayList<>();
    } 
    public int genOrderNum() {
        Random rand = new Random();
        
        int randInt = rand.nextInt(90000 - 10000) + 10000;
        return randInt;
    }
    public int getOrderNo() {
        return orderNo;
    }

    public int getOrderTime() {
        return orderTime;
    }

    public Day getOrderDay() {
        return orderDay;
    }

    public Customer getCustomer() {
        return new Customer(customer);
    }

    public ArrayList<Beverage> getBeverages() {
        return beverages;
    }
    public void setOrderNum(int on) {
        orderNo = on;
    }

    public void setOrderTime(int ot) {
        orderTime = ot;
    }

    public void setOrderDay(Day od) {
        orderDay = od;
    }

    public void setCustomer(Customer c) {
        customer = c;
    }
    public boolean isWeekend() {
        return orderDay == Day.SATURDAY || orderDay == Day.SUNDAY;
    }

    public Beverage getBeverage(int itemNum) {
        return beverages.get(itemNum);
    }
    public int getTotalItems() {
        return beverages.size();
    }
    
    public void addNewBeverage(String name, Size size, boolean extraShot, boolean extraSyrup) {
        Coffee c = new Coffee(name, size, extraShot, extraSyrup);
        beverages.add(c);
    }

    public void addNewBeverage(String name, Size size, int numOfFruits, boolean proteinPowder) {
        Smoothie s = new Smoothie(name, size, numOfFruits, proteinPowder);
        beverages.add(s);
    }

    public void addNewBeverage(String name, Size size) {
        boolean isWeekend = orderDay == Day.SATURDAY || orderDay == Day.SUNDAY;
        Alcohol a = new Alcohol(name, size, isWeekend);
        beverages.add(a);
    }
    public double calcOrderTotal() {
        double orderTotal = 0;

        for (Beverage b : beverages) {
            orderTotal += b.calcPrice();
        }

        return orderTotal;
    }
    public int findNumOfBeveType(Type type) {
        int count = 0;

        for (Beverage b : beverages) {
            if (b.getType() == type) {
                count++;
            }
        }

        return count;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder("__________________________________\n");
        s.append(orderDay.toString()).append(", ").append(orderTime)
                .append("\n").append(customer.toString()).append(" Order Num: ").append(orderNo);

        for (Beverage b : beverages) {
            s.append("\n").append(b.toString());
        }

        s.append("\n Order Total: ").append(calcOrderTotal());
        return s.toString();
    }
    public int compareTo(Order o) {
        return Integer.compare(orderNo, o.getOrderNo());
    }

   

    

    
}




