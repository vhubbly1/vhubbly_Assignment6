package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlcoholTestStudent {
    private Alcohol alcohol;

    @BeforeEach
    void setUp() throws Exception {
        
        alcohol = new Alcohol("Vodka", Size.MEDIUM, true);
    }

    @AfterEach
    void tearDown() throws Exception {
        
        alcohol = null;
    }

    @Test
    void testCalcPrice() {
        double expectedPrice = alcohol.getBasePrice() + alcohol.addSizePrice() + alcohol.getWeekendFee();
        assertEquals(expectedPrice, alcohol.calcPrice());
    }

    @Test
    void testToString() {
        String expectedString = "Vodka, MEDIUM Weekend, $" + alcohol.calcPrice();
        assertEquals(expectedString, alcohol.toString());
    }

    @Test
    void testAlcohol() {
        assertNotNull(alcohol);
        assertEquals("Vodka", alcohol.getBevName());
        assertEquals(Type.ALCOHOL, alcohol.getType());
        assertEquals(Size.MEDIUM, alcohol.getSize());
        assertTrue(alcohol.getIsWeekend());
    }

    @Test
    void testEqualsAlcohol() {
        Alcohol sameAlcohol = new Alcohol("Vodka", Size.MEDIUM, true);
        assertTrue(alcohol.equals(sameAlcohol));
        
        Alcohol differentAlcohol = new Alcohol("Rum", Size.LARGE, false);
        assertFalse(alcohol.equals(differentAlcohol));
    }

    @Test
    void testGetIsWeekend() {
        assertTrue(alcohol.getIsWeekend());
    }

    @Test
    void testGetWeekendFee() {
        assertEquals(0.6, alcohol.getWeekendFee());
    }

    @Test
    void testSetIsWeekend() {
        alcohol.setIsWeekend(false);
        assertFalse(alcohol.getIsWeekend());
    }
}
