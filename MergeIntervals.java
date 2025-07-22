import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class MergeIntervals{
    public int[][] merge(int[][] arr){
        if (arr.length < 1) return arr;
        //sort array
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        result.add(arr[0]);
        for (int i = 1; i<arr.length; i++){
            int[] last = result.get(result.size() - 1);
            int[] curr = arr[i];

            if (curr[0] <= last[1]){
                last[1] = Math.max(last[1], curr[1]);
            }else{
                result.add(curr);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args){
        MergeIntervals m = new MergeIntervals();
        int[][] arr = {{1, 5}, {2, 7}, {4, 6}};
        int[][] merged = m.merge(arr);
        System.out.println(Arrays.deepToString(merged));
    }
}