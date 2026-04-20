package array;

import java.util.Scanner;

public class Syntax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]={34,56,75,23};
        int arr[]=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // printing the array marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
