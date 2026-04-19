package loops;

public class Sumofn {
    public static void main(String[] args) {
        int i=1;
        int n=10;
        int sum=0;
        while (i<=n) {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
