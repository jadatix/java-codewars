package labs2022.lab1;

public class ArrayTask {
    public static double[] arrayTask(double[] array){
        int n = array.length;
        double[] result = new double[n];
        for(int i = 0; i < n; i++){
            result[i] = (i%2==0)? array[i]:array[n-i];
        }
        return result;
    }
}
