package array;
// (1,2)(1,3)(1,4)(1,5)(1,6)
// (2,3)(2,4)(2,5)(2,6)
// (3,4)(3,5)(3,6)
// (4,5)(4,6)
// (5,6)
public class Pairs {
    public static void pairinarr(int[] arr){
        
        for (int i =0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        pairinarr(arr);
    }
}
