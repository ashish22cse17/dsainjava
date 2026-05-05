package recursion;

public class firstoccur {
    public static int FirstDec(int[] arr , int n,int i){
        
        if (i==arr.length) {
            return -1;
        }
        if(arr[i]==n)
            return i;

        return FirstDec(arr, n,i+1);
    }
    public static int Lastoccur(int[] arr,int n,int k){
        if (k==-1) {
            return -1;
        }
        if(arr[k]==n)
            return k;

        return Lastoccur(arr, n,k-1);
    }

    public static void main(String[] args) {
         int arr[]={1,2,3,4,9,6};
         System.out.println(FirstDec(arr,5,0));
         System.out.println(Lastoccur(arr,5,arr.length-1));
    }
    
}
