package sortingalgorithms;
//conut sort is only valid for the postive number containing array
public class countingsort {
    public static void counting(int nums[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest=Math.max(largest, nums[i]);
        }
        int count[]=new int[largest+1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                nums[j]=i;
                j++;
                count[i]--; 
            }
        }
    }
    public static void main(String[] args) {
         int arr[] = { 5, 8, 4, 2, 9, 3, 6 };
        counting(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
