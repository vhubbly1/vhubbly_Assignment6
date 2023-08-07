package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TypeTestStudent {

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void test() {
        
        assertEquals(Type.COFFEE, Type.valueOf("COFFEE"));
        assertEquals(Type.SMOOTHIE, Type.valueOf("SMOOTHIE"));
        assertEquals(Type.ALCOHOL, Type.valueOf("ALCOHOL"));

        
        assertEquals(0, Type.COFFEE.ordinal());
        assertEquals(1, Type.SMOOTHIE.ordinal());
        assertEquals(2, Type.ALCOHOL.ordinal());

      
        Type[] types = Type.values();
        assertEquals(3, types.length);
        assertEquals(Type.COFFEE, types[0]);
        assertEquals(Type.SMOOTHIE, types[1]);
        assertEquals(Type.ALCOHOL, types[2]);
    }
}
