package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmoothieTestStudent {
    private Smoothie smoothie;

    @BeforeEach
    void setUp() throws Exception {
        smoothie = new Smoothie("Berry Blast", Size.MEDIUM, 3, true);
    }

    @AfterEach
    void tearDown() throws Exception {
        smoothie = null;
    }

    @Test
    void testCalcPrice() {
        // Calculate the expected price manually and compare
        double expectedPrice = smoothie.getBasePrice() + smoothie.addSizePrice()
                + (smoothie.getNumOfFruits() * smoothie.getFruitCost()) + smoothie.getProteinCost();
        assertEquals(expectedPrice, smoothie.calcPrice());
    }

    @Test
    void testToString() {
        String expectedString = "Berry Blast, MEDIUM 3 Fruits Protein powder, $" + smoothie.calcPrice();
        assertEquals(expectedString, smoothie.toString());
    }

    @Test
    void testSmoothie() {
        assertNotNull(smoothie);
        assertEquals("Berry Blast", smoothie.getBevName());
        assertEquals(Size.MEDIUM, smoothie.getSize());
        assertEquals(3, smoothie.getNumOfFruits());
        assertTrue(smoothie.getAddProtien());
    }

    @Test
    void testGetNumOfFruits() {
        assertEquals(3, smoothie.getNumOfFruits());
    }

    @Test
    void testGetAddProtien() {
        assertTrue(smoothie.getAddProtien());
    }

    @Test
    void testGetFruitCost() {
        assertEquals(0.5, smoothie.getFruitCost());
    }

    @Test
    void testGetProteinCost() {
        assertEquals(1.5, smoothie.getProteinCost());
    }

    @Test
    void testSetNumOfFruits() {
        smoothie.setNumOfFruits(5);
        assertEquals(5, smoothie.getNumOfFruits());
    }

    @Test
    void testSetProteinPowder() {
        smoothie.setProteinPowder(false);
        assertFalse(smoothie.getAddProtien());
    }

    @Test
    void testEqualsSmoothie() {
        Smoothie differentSmoothie = new Smoothie("Tropical Delight", Size.SMALL, 2, false);
        assertNotEquals(smoothie, differentSmoothie);
    }
}
