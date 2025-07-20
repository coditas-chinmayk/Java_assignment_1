import java.util.Arrays;

public class MinMax {
    public double[] minmax(double[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("array cannot be null");
        }
        double maximum = Double.NEGATIVE_INFINITY;
        double minimum = Double.POSITIVE_INFINITY;
        for (double i : arr){
            if (i < minimum){
                minimum = i;
            } 
            if (i > maximum){
                maximum = i;
            }
        }
        return new double[] {minimum, maximum};
    
        
    }
    public static void main(String[] args) {
        MinMax mnMx = new MinMax();
        double[] arr = {22.0, -10.0, 387048.0, 77.0};
        double[] result = mnMx.minmax(arr);
        System.out.println(Arrays.toString(result));
    }
    
}

