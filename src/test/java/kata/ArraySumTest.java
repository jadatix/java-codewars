package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySumTest {

    @Test
    void sum() {
        assertEquals(16, ArraySum.sum(new int[] { 6, 2, 1, 8, 10}));
    }
}