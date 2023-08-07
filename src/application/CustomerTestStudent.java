package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTestStudent {
    private Customer customer;

    @BeforeEach
    void setUp() throws Exception {
        customer = new Customer("Alice", 25);
    }

    @AfterEach
    void tearDown() throws Exception {
        customer = null;
    }

    @Test
    void testCustomerCustomer() {
        Customer anotherCustomer = new Customer(customer);
        assertEquals(customer.getName(), anotherCustomer.getName());
        assertEquals(customer.getAge(), anotherCustomer.getAge());
    }

    @Test
    void testCustomerStringInt() {
        assertNotNull(customer);
        assertEquals("Alice", customer.getName());
        assertEquals(25, customer.getAge());
    }

    @Test
    void testGetAge() {
        assertEquals(25, customer.getAge());
    }

    @Test
    void testSetAge() {
        customer.setAge(30);
        assertEquals(30, customer.getAge());
    }

    @Test
    void testGetName() {
        assertEquals("Alice", customer.getName());
    }

    @Test
    void testSetName() {
        customer.setName("Bob");
        assertEquals("Bob", customer.getName());
    }

    @Test
    void testToString() {
        String expectedString = "Alice, 25y/o";
        assertEquals(expectedString, customer.toString());
    }
}
