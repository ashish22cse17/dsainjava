package functionmethods;

public class Binarytodec {
    public static int converter(int n){
        int retnum=0;
        int power=0;
        while (n>0) {
            int d=n%10;
            retnum=retnum+d*(int)Math.pow(2, power);
            power++;
            n=n/10;
        }
        return retnum;
    }
    public static void main(String[] args) {
        int n=1111;
        converter(n);
        System.out.println(converter(n));
    }
}
