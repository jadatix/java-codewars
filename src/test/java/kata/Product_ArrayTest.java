package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Product_ArrayTest {

    @Test
    void productArray() {
        assertArrayEquals(new long[]{20,12}, Product_Array.productArray(new int[]{12,20}));
        assertArrayEquals(new long[]{10,2,5}, Product_Array.productArray(new int[]{1,5,2}));
        assertArrayEquals(new long[]{216,24,162,324}, Product_Array.productArray(new int[]{3,27,4,2}));
    }
}