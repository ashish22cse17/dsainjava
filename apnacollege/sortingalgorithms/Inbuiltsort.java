package sortingalgorithms;

import java.util.Arrays;
import java.util.Collections;

public class Inbuiltsort {
    public static void main(String[] args) {
        Integer arr[]={5,8,3,9,1,2,4};
        Arrays.sort(arr,0,3);
         for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        // Arrays.sort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
    

    
}
