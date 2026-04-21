package array;

public class Maxsum {
    public static int subArray(int arr[]) {
        int maxSum=Integer.MIN_VALUE;
        int curSum=0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                curSum=0;
                for (int k = start; k <=end; k++) {
                    curSum=curSum+arr[k];
                }
                if(curSum>maxSum){
                    maxSum=curSum;
                }
            }
        }
        return maxSum;
    }

    public static void kad2(int nums[]){
        int maxSum = nums[0];
        int curSum = nums[0];

    for (int i = 1; i < nums.length; i++) {
        curSum = Math.max(nums[i], curSum + nums[i]);
        maxSum = Math.max(maxSum, curSum);
    }

        System.out.println(maxSum);
    }
    
    public static void kad(int nums[]){
        int maxSum=Integer.MIN_VALUE;
        int curSum=0;
        for (int i = 0; i < nums.length; i++) {
            curSum=curSum+nums[i];
            if(curSum<0)
                curSum=0;
            maxSum=Math.max(curSum, maxSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int nums[]={
          -2,1,-3,4,-1,2,1,-5,4
        };
        System.out.println(subArray(nums));
        kad2(nums);
    }
}
