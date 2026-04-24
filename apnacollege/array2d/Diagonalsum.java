package array2d;

public class Diagonalsum {
    public static int matrixSum(int[][] nums) {
        int pd=0;
        int sd=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if(i==j){
                    pd=pd+nums[i][j];
                }
                else if ((i+j)==(nums.length-1)) {
                    sd=sd+nums[i][j];
                }
                else
                    continue;
            }
        }
        return pd+sd;
        
    }
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
        int n=matrixSum(arr);
        System.out.println(n);
    }
}
