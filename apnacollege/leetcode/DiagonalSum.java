package leetcode;
// 1572. Matrix Diagonal Sum
// Given a square matrix mat, return the sum of the matrix diagonals.

// Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

// Example 1:


// Input: mat = [[1,2,3],
//               [4,5,6],
//               [7,8,9]]
// Output: 25
// Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
// Notice that element mat[1][1] = 5 is counted only once.
// Example 2:

// Input: mat = [[1,1,1,1],
//               [1,1,1,1],
//               [1,1,1,1],
//               [1,1,1,1]]
// Output: 8

public class DiagonalSum {
    // public static int matrixSum(int[][] nums) {
    //     int pd=0;
    //     int sd=0;
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = 0; j < nums[0].length; j++) {
    //             if(i==j){
    //                 pd=pd+nums[i][j];
    //             }
    //             else if ((i+j)==(nums.length-1)) {
    //                 sd=sd+nums[i][j];
    //             }
    //             else
    //                 continue;
    //         }
    //     }
    //     return pd+sd;
        
    // }
    public static int matrixSum2(int[][] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
           sum+=nums[i][i];
           if (i!=nums.length-i-1) {
            sum+=nums[i][nums.length-i-1];
           }
        }
        return sum;
        
    }
    public static void main(String[] args) {
         int arr[][]={{1,2,3,1},{4,5,6,5},{7,8,9,2},{4,8,5,9}};
        int n=matrixSum2(arr);
        System.out.println(n);
    }
}
