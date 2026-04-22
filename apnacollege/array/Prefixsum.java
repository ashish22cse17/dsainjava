package array;

public class Prefixsum {
    public static void subArray(int arr[]) {
       
        int prrSum[]=new int[arr.length];
        prrSum[0]=arr[0];
        for (int i = 1; i < prrSum.length; i++) {
            
            prrSum[i]=prrSum[i-1]+arr[i];
        }

        int maxSum=Integer.MIN_VALUE;
        int curSum=0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                curSum=start==0?prrSum[end]:prrSum[end]-prrSum[start-1];
                
                if(curSum>maxSum){
                    maxSum=curSum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int nums[]={5,4,-1,7,8};
        subArray(nums);
    }
}
