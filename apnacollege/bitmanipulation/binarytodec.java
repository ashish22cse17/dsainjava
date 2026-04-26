package bitmanipulation;

import java.util.Scanner;

public class binarytodec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binary=sc.nextInt();
        int dec=0;
        int power=0;
        while (binary>0) {
            int lastdigi=binary%10;
            dec=dec+(lastdigi*(int)Math.pow(2,power));
            power++;
            binary=binary/10;

        }
        System.out.println(dec);
        sc.close();
    }
}
