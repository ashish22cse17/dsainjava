package bitmanipulation;

public class updateithbit {
    public static int updateBit(int n, int i, int newbit) {
        if (newbit == 0) {
            int check = ~(1 << i);
            return n & check;
        } 
        else {
            int check = 1 << i;
            return n | check;
        }

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(updateBit(n, 3, 0));
    }
}
