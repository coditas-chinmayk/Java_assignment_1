import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
public class TwoSum{
    public int[] twosum(int[] numbers, int target){
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++){
            int complement = target - numbers[i];
            if (hmap.containsKey(complement)){
                return new int[] {hmap.get(complement), i};
            }
            hmap.put(numbers[i], i);
        }
        return new int[] {};
    }
    

    public static void main(String[] args){
        TwoSum t = new TwoSum();
        int[] arr = {10, 20, 25, 76, 80, 40, 31};
        int target = 100;
        System.out.println(Arrays.toString(t.twosum(arr, target)));
    }
}