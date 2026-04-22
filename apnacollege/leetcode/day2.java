package leetcode;
//do it such divide it in left and right then multiply
public class day2 {
    //accurate with O(n2) but time exceed
    public static int[] Solution(int arr[]) {
        int nums[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int le = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    le *= arr[j];
                }
            }
            nums[i] = le;
        }
        return nums;
    }
//works for postive number only falis if it contains 0
    public static int[] Solution1(int arr[]) {
        int n = arr.length;
        int result[] = new int[n];

        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }

        for (int i = 0; i < n; i++) {
            result[i] = product;
        }
        for (int i = 0; i < result.length; i++) {
            result[i]=result[i]/arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 1, 0, -3, 3 };
        int ans[] = Solution1(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

}
