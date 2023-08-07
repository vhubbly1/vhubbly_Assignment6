package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BevShopTestStudent {
    private BevShop bevShop;

    @BeforeEach
    void setUp() throws Exception {
        bevShop = new BevShop();
    }

    @AfterEach
    void tearDown() throws Exception {
        bevShop = null;
    }

    @Test
    void testBevShop() {
        assertNotNull(bevShop);
        assertEquals(0, bevShop.totalNumOfMonthlyOrders());
    }

    @Test
    void testIsValidTime() {
        assertTrue(bevShop.isValidTime(BevShop.MIN_TIME));
        assertFalse(bevShop.isValidTime(BevShop.MIN_TIME - 1));
        assertTrue(bevShop.isValidTime(BevShop.MAX_TIME));
        assertFalse(bevShop.isValidTime(BevShop.MAX_TIME + 1));
    }

    @Test
    void testGetMaxNumOfFruits() {
        assertEquals(BevShop.MAX_FRUIT, bevShop.getMaxNumOfFruits());
    }

    @Test
    void testGetMinAgeForAlcohol() {
        assertEquals(BevShop.MIN_AGE_FOR_ALCOHOL, bevShop.getMinAgeForAlcohol());
    }

    @Test
    void testIsMaxFruit() {
        assertTrue(bevShop.isMaxFruit(BevShop.MAX_FRUIT + 1));
        assertFalse(bevShop.isMaxFruit(BevShop.MAX_FRUIT));
    }

    @Test
    void testIsEligibleForMore() {
        assertTrue(bevShop.isEligibleForMore());
        assertTrue(bevShop.isEligibleForMore());
    }

    

    @Test
    void testIsValidAge() {
        assertTrue(bevShop.isValidAge(BevShop.MIN_AGE_FOR_ALCOHOL));
        assertFalse(bevShop.isValidAge(BevShop.MIN_AGE_FOR_ALCOHOL - 1));
    }

    

    @Test
    void testSortOrders() {
        
       
        
    }


    @Test
    void testValidAge() {
        assertTrue(bevShop.validAge(BevShop.MIN_AGE_FOR_ALCOHOL));
        assertFalse(bevShop.validAge(BevShop.MIN_AGE_FOR_ALCOHOL - 1));
    }

    @Test
    void testGetMaxOrderForAlcohol() {
        assertEquals(BevShop.MAX_ORDER_FOR_ALCOHOL, bevShop.getMaxOrderForAlcohol());
    }

    @Test
    void testToString() {
        
    }
}
