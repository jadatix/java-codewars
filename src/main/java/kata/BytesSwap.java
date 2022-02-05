package kata;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BytesSwap {
    public static int[] DataReverse(int[] data) {
        int[][] array = new int[data.length/8][8];
        int[] rez= new int[data.length];
        for (int j = 0; j < data.length/8; j++) {
            for (int i = 0; i < 8; i++) {
                array[j][i] = data[i+j*8];
            }
        } int k=0;
        for (int j = data.length/8-1; j >=0 ; j--) {
            for (int i = 0; i < 8; i++) {
                rez[k++] = array[j][i];
            }
        }
       return rez;
    }
}
