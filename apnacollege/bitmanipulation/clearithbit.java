package bitmanipulation;

public class clearithbit {
    public static int clearBit(int n,int i){
        int check=~(1<<i);
       return n&check;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(clearBit(n,1));
    }
}

