package recursion;

public class printinrevese {
    public static void printRev(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printRev(n-1);

    }
    public static void main(String[] args) {
        int n=500000;
        printRev(n);
    }
}
