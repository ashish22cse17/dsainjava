package bitmanipulation;

public class evenodd {
    public static void main(String[] args) {
        int n = 5;
        int check = 1;
        if ((n & check) == 1) {
            System.out.println("yes odd");
        } else
            System.out.println("yes even");
    }
}