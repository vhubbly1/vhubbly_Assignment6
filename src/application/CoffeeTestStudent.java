package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeTestStudent {
    private Coffee coffee;

    @BeforeEach
    void setUp() throws Exception {
        coffee = new Coffee("Latte", Size.MEDIUM, true, false);
    }

    @AfterEach
    void tearDown() throws Exception {
        coffee = null;
    }

    @Test
    void testCalcPrice() {
        double expectedPrice = coffee.getBasePrice() + coffee.addSizePrice() + coffee.getShotCost();
        assertEquals(expectedPrice, coffee.calcPrice());
        
        Coffee coffeeWithSyrup = new Coffee("Mocha", Size.LARGE, false, true);
        expectedPrice = coffeeWithSyrup.getBasePrice() + 2 * coffeeWithSyrup.addSizePrice() + coffeeWithSyrup.getSyrupCost();
        assertEquals(expectedPrice, coffeeWithSyrup.calcPrice());
    }

    @Test
    void testToString() {
        String expectedString = "Latte, MEDIUM Extra shot, $" + coffee.calcPrice();
        assertEquals(expectedString, coffee.toString());
    }

    @Test
    void testCoffee() {
        assertNotNull(coffee);
        assertEquals("Latte", coffee.getBevName());
        assertEquals(Type.COFFEE, coffee.getType());
        assertEquals(Size.MEDIUM, coffee.getSize());
        assertTrue(coffee.getExtraShot());
        assertFalse(coffee.getExtraSyrup());
    }

    @Test
    void testGetExtraShot() {
        assertTrue(coffee.getExtraShot());
    }

    @Test
    void testGetExtraSyrup() {
        assertFalse(coffee.getExtraSyrup());
    }

    @Test
    void testGetShotCost() {
        assertEquals(0.5, coffee.getShotCost());
    }

    @Test
    void testGetSyrupCost() {
        assertEquals(0.5, coffee.getSyrupCost());
    }

    @Test
    void testSetExtraShot() {
        coffee.setExtraShot(false);
        assertFalse(coffee.getExtraShot());
    }

    @Test
    void testSetExtraSyrup() {
        coffee.setExtraSyrup(true);
        assertTrue(coffee.getExtraSyrup());
    }

    @Test
    void testEqualsCoffee() {
        Coffee sameCoffee = new Coffee("Latte", Size.MEDIUM, true, false);
        assertTrue(coffee.equals(sameCoffee));
        
        Coffee differentCoffee = new Coffee("Mocha", Size.LARGE, false, true);
        assertFalse(coffee.equals(differentCoffee));
    }
}
