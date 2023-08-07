package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DayTestStudent {

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void test() {
        
        assertEquals(Day.SUNDAY, Day.valueOf("SUNDAY"));
        assertEquals(Day.MONDAY, Day.valueOf("MONDAY"));
        assertEquals(Day.TUESDAY, Day.valueOf("TUESDAY"));
        assertEquals(Day.WEDNESDAY, Day.valueOf("WEDNESDAY"));
        assertEquals(Day.THURSDAY, Day.valueOf("THURSDAY"));
        assertEquals(Day.FRIDAY, Day.valueOf("FRIDAY"));
        assertEquals(Day.SATURDAY, Day.valueOf("SATURDAY"));

        
        assertEquals(0, Day.SUNDAY.ordinal());
        assertEquals(1, Day.MONDAY.ordinal());
        assertEquals(2, Day.TUESDAY.ordinal());
        assertEquals(3, Day.WEDNESDAY.ordinal());
        assertEquals(4, Day.THURSDAY.ordinal());
        assertEquals(5, Day.FRIDAY.ordinal());
        assertEquals(6, Day.SATURDAY.ordinal());

        
        Day[] days = Day.values();
        assertEquals(7, days.length);
        assertEquals(Day.SUNDAY, days[0]);
        assertEquals(Day.MONDAY, days[1]);
        assertEquals(Day.TUESDAY, days[2]);
        assertEquals(Day.WEDNESDAY, days[3]);
        assertEquals(Day.THURSDAY, days[4]);
        assertEquals(Day.FRIDAY, days[5]);
        assertEquals(Day.SATURDAY, days[6]);
    }
}
