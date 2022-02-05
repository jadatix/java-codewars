package kata;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArraySum {
    public static int sum(int[] numbers)
    {
        if( numbers == null || numbers.length <2) return 0;
        int min=numbers[0],max=numbers[0], sum=0;
        for (int i = 0; i < numbers.length; i++){
            min=(min>numbers[i])? numbers[i]:min;
            max=(max<numbers[i])? numbers[i]:max;
            sum+=numbers[i];
        }

        return sum-max-min;
    }
}
