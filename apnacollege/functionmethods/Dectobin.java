package functionmethods;

public class Dectobin {
    // not correct coded by me...
    // public static int converter(int n){
    //     int retnum=0;
    //     while (n>0) {
    //         int rem=n%2;
    //         retnum=retnum*10+rem;
    //         n=n/2;
            
    //     }
    //     return retnum;
    // }
    public static int converter2(int n){
        int retnum=0;
        int power=0;
        while (n>0) {
            int rem=n%2;
            retnum=retnum+rem*(int )Math.pow(10, power);
            power++;
            n=n/2;
            
        }
        return retnum;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(converter2(n));
        // System.out.println(converter(n));
        
    }
}
