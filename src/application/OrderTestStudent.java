package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTestStudent {
    private Order order;
    private Customer customer;

    @BeforeEach
    void setUp() throws Exception {
        customer = new Customer("Alice", 25);
        order = new Order(10, Day.MONDAY, customer);
    }

    @AfterEach
    void tearDown() throws Exception {
        order = null;
        customer = null;
    }

    @Test
    void testOrder() {
        assertNotNull(order);
        assertNotNull(order.getCustomer());
        assertEquals(Day.MONDAY, order.getOrderDay());
        assertEquals(10, order.getOrderTime());
    }

    @Test
    void testGenOrderNum() {
        int orderNum = order.genOrderNum();
        assertTrue(orderNum >= 10000 && orderNum <= 89999);
    }

    @Test
    void testGetOrderNo() {
        int orderNum = order.getOrderNo();
        assertTrue(orderNum >= 10000 && orderNum <= 89999);
    }

    @Test
    void testGetOrderTime() {
        assertEquals(10, order.getOrderTime());
    }

    @Test
    void testGetOrderDay() {
        assertEquals(Day.MONDAY, order.getOrderDay());
    }

    @Test
    void testGetCustomer() {
        assertEquals("Alice", order.getCustomer().getName());
        assertEquals(25, order.getCustomer().getAge());
    }

    @Test
    void testGetBeverages() {
        assertNotNull(order.getBeverages());
        assertEquals(0, order.getBeverages().size());
    }

    @Test
    void testSetOrderNum() {
        order.setOrderNum(12345);
        assertEquals(12345, order.getOrderNo());
    }

    @Test
    void testSetOrderTime() {
        order.setOrderTime(15);
        assertEquals(15, order.getOrderTime());
    }

    @Test
    void testSetOrderDay() {
        order.setOrderDay(Day.TUESDAY);
        assertEquals(Day.TUESDAY, order.getOrderDay());
    }

    @Test
    void testSetCustomer() {
        
    }

    @Test
    void testIsWeekend() {
        assertFalse(order.isWeekend());
        
        order.setOrderDay(Day.SATURDAY);
        assertTrue(order.isWeekend());
        
        order.setOrderDay(Day.SUNDAY);
        assertTrue(order.isWeekend());
    }

    // Continue filling out the remaining test methods based on your class implementation.
    // Make sure to cover different scenarios and edge cases for each method.
}
