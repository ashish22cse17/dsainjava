package array;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[10];
        for (int i = 0; i < marks.length; i++) {
            marks[i]=sc.nextInt();
        }
        int find=sc.nextInt();
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]==find){
                System.out.println("mil gya "+ i);
                break;
            }
        }
        sc.close();
    }
}
