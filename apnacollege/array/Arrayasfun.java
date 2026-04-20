package array;

public class Arrayasfun {
    public static void argumenttest(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=2;
        }
    }
    public static void main(String[] args) {
        int arr[]={45,67,34};
        argumenttest(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
