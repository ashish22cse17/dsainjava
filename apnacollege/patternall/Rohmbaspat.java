package patternall;

public class Rohmbaspat {
    public static void hallowrbz(int n){
        for (int i = 1; i <=n; i++) {
            // space
            for (int j = 1; j <=n-i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= n; j++) {
                if(i==1||j==1||j==n||i==n)
                System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            // space
            for (int j = 1; j <=n-i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= n; j++) {

                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("aby");
        hallowrbz(n);
    }
}
