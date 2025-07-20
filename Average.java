/*assignment problem number 2:
 * code takes in an array or integers and returns their average
 */

public class Average {
    public double avg(int[] nums){
        if (nums == null || nums.length == 0){
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        double sum = 0.0;
        for (int n : nums){
            sum += n;
        }
        double average = sum / nums.length;
        return average;
    }
    public static void main(String[] args){
        Average a = new Average();
        int[] numbers = {10, 20, 22, 26, 78};
        double ans = a.avg(numbers);
        System.out.println("The average is: "+ ans);
    }
}
