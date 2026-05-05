package recursion;

public class xtopowern {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }
    public static int power(int x,int n,int justforfun){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return power(x, n/2)*power(x, n/2);
        }
        return power(x, n/2)*power(x, n/2)*power(x, n%2);
    }

    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(power(x, n));
        System.out.println(power(x, n, 0));
    }
}
