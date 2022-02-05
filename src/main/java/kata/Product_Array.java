package kata;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Product_Array {
    public static long[] productArray(int[] numbers)
    {
        long prod = Arrays.stream(numbers).asLongStream().reduce(1, (x, y) -> x * y);
        return Arrays.stream(numbers).mapToLong(x-> prod/x).toArray();
    }
}
