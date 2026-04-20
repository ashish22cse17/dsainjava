package array;

public class Largestinarr {
    public static int FindLarge(int[] arr){
        int large=Integer.MIN_VALUE;
        for (int i=0 ; i<arr.length;i++) {
            if(large<arr[i])
                large=arr[i];
        }
        return large;

    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,9,5};
        System.out.println(FindLarge(arr));
    }
}
