package patternall;
//  *  *  *  *  * 
//  *           *
//  *           *
//  *           *
//  *  *  *  *  *
import java.util.Scanner;

public class Hollowpat {
    public static void hollowrec(int a,int b){
        for (int i = 0; i < a; i++) {
           for (int j = 0; j < b; j++) {
            if(i==0||i==a-1||j==0||j==b-1){
                System.out.print(" * ");
            }
            else
                System.out.print("   ");
           } 
           System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n & m : ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        //this logic is for square..
        // for (int i = 0; i < n; i++) {
        //    for (int j = 0; j < n; j++) {
        //     if(i==0||i==n-1||j==0||j==n-1){
        //         System.out.print(" * ");
        //     }
        //     else
        //         System.out.print("   ");
        //    } 
        //    System.out.println();
        // }
        hollowrec(n,m);
        sc.close();
    }
}
