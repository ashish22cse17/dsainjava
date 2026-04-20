package array;

public class Reverse {
    public static void Rev(int[] arr){
        int start=0,end=arr.length-1;
        while (start<end) {
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int rt[]={1,2,3,4,5,6,7,8};
        Rev(rt);
        for (int i : rt) {
            System.out.print(i+" ");
        }
    }
}
