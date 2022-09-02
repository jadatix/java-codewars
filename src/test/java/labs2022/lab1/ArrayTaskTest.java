package labs2022.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTaskTest {

    @Test
    void arrayTask() {
        assertArrayEquals(new double[]{3.1,5.7,4.3,7.7},ArrayTask.arrayTask(new double[]{3.1,7.7,4.3,5.7}));
    }
}