import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        kSum(nums, 4, 0, target, new ArrayList<>(), res);
        return res;
    }

    private void kSum(int[] nums, int k, int start, long target, List<Integer> temp, List<List<Integer>> res) {
        if (k != 2) {
            for (int i = start; i <= nums.length - k; i++) {
                if (i > start && nums[i] == nums[i - 1]) continue;
                temp.add(nums[i]);
                kSum(nums, k - 1, i + 1, target - nums[i], temp, res);
                temp.remove(temp.size() - 1);
            }
            return;
        }

        int left = start, right = nums.length - 1;
        while (left < right) {
            long sum = (long) nums[left] + nums[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                List<Integer> quad = new ArrayList<>(temp);
                quad.add(nums[left]);
                quad.add(nums[right]);
                res.add(quad);
                left++;
                while (left < right && nums[left] == nums[left - 1]) left++;
            }
        }
    }
}
