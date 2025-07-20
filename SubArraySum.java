public class SubArraySum{
    public static int subArraySum(int[] arr){
        int maxSum = arr[0];
        int curSum = 0;
        for (int i = 0; i < arr.length; i++){
            curSum = Math.max(arr[i], 0);
            curSum += arr[i];
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] numbers = {-2, 3, 4, -7, 10, 3, 3, 4, -9, 6};
        System.out.println(SubArraySum.subArraySum(numbers));
    }
}