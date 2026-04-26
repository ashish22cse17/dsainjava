package bitmanipulation;

import java.util.Scanner;
public class binomialcoff {
    public static int factotial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factotial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int n = sc.nextInt();
        int r = sc.nextInt();
        int binomailCoff = factotial(n) / (factotial(r) * factotial(n - r));
        System.out.println(binomailCoff);
        sc.close();
    }
}
