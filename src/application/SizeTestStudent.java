package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SizeTestStudent {

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void test() {
        // Test for each size
        assertEquals(Size.SMALL, Size.valueOf("SMALL"));
        assertEquals(Size.MEDIUM, Size.valueOf("MEDIUM"));
        assertEquals(Size.LARGE, Size.valueOf("LARGE"));

        // Test ordinal values
        assertEquals(0, Size.SMALL.ordinal());
        assertEquals(1, Size.MEDIUM.ordinal());
        assertEquals(2, Size.LARGE.ordinal());

        // Test values() method
        Size[] sizes = Size.values();
        assertEquals(3, sizes.length);
        assertEquals(Size.SMALL, sizes[0]);
        assertEquals(Size.MEDIUM, sizes[1]);
        assertEquals(Size.LARGE, sizes[2]);
    }
}
