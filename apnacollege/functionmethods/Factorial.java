package functionmethods;

public class Factorial {
    public static int fact(int a){
        int facto=1;
        for (int i = a; i > 0; i--) {
            facto=facto*i;
        }
        return facto;
        
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        int a=4;
        int b=9;
        System.out.println(fact(a));
        System.out.println(mul(a, b));
    }
}
