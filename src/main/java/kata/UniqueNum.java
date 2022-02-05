package kata;

import java.util.Arrays;

public class UniqueNum {
    public static double findUniq(double arr[]) {
//        double unique=arr[0];
//        if(arr[0]==arr[1]) unique=arr[0];
//            else if(arr[1]==arr[2]) unique=arr[1];
//                else if(arr[2]==arr[0]) unique=arr[2];
//        double[] doubles = Arrays.stream(arr).distinct().toArray();
//        for (int i = 0; i < 2; i++) {
//            if(doubles[i]!=unique) return doubles[i];
//        }
//        return arr[0];
        Arrays.sort(arr);
        if(arr[0]==arr[1]) return arr[arr.length-1];
        else return arr[0];
    }
}
