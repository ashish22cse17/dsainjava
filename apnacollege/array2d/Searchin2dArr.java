package array2d;

import java.util.Scanner;

public class Searchin2dArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        // 1 2 3
        // 4 5 6
        // 7 8 9
        
        
        int key =5;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]==key){
                    System.out.println("found at "+ i +":"+j);
                    break;
                }
            }
        }
        sc.close();
    }
}
