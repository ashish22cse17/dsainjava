package array;

public class Binarysearch {
    public static int binarySearch(int[] arr,int find){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
           int mid=(start+end)/2;
            if(find>arr[mid]){
                
                start=mid+1;
            }
            else if(find<arr[mid]){
                end=mid-1;
            }
            else if(find==arr[mid]){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        binarySearch(a,5);
        System.out.println(binarySearch(a, 5));
    }
}
