package functionmethods;

import java.util.Scanner;

public class Primeinrange {
    public static boolean isPrime(int n){
        boolean hai=true;
        if(n==2){
            return true;
        }
        else{
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0){
                hai=false;
                break;
            }
        }
        }
        return hai;

    }
    public static void Primetilln(int init,int end){
        for (int i=init ; i <=end; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
            
        }
    }
    public static void Primetilln(int end){
        for (int i=2 ; i <=end; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
            
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //int in=sc.nextInt();
        int end=sc.nextInt();
        Primetilln( end);
        sc.close();
    }
}
