package leetcode;
// 485. Max Consecutive Ones

// Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

// Example 1:

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
// Example 2:

// Input: nums = [1,0,1,1,0,1]
// Output: 2
public class MaxConsecutive {
    // public static int findMaxConsecutiveOnes(int[] nums) {
    //     int glb=0;
    //     int n=0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if(nums[i]==1){
    //             n++;
    //             if (glb<n) {
    //                 glb=n;
                    
    //             }
    //         }
    //         else{
    //             if(n>glb)glb=n;
    //             n=0;
    //         }
    //     }
    //     return glb;
        
    // }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int glb=0;
        int n=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                n++;
                glb=Math.max(n, glb);
            }
            else{
                n=0;
            }
        }
        return glb;
        
    }

    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        int n=findMaxConsecutiveOnes(arr);
        System.out.println(n);
    }
    
}
