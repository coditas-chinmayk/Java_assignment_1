import java.util.Arrays;

public class SortColours{
    public void sortColour(int[] nums){
        int[] freq = {0, 0, 0};

        for(int num : nums){
            freq[num]++;
        }
        
        int index = 0;
        for(int i = 0; i < freq.length; i++){
            while (freq[i]-- > 0){
                nums[index++] = i;
            }
        }

    }
    public static void main(String[] args){
        SortColours s = new SortColours();
        int[] colors = {1, 0, 0, 2, 2, 2, 0, 2, 1, 2};
        s.sortColour(colors);
        System.out.println(Arrays.toString(colors));
    }
}