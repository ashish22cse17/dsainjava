package bitmanipulation;

public class setithbit {
    public static int getBit(int n,int i){
        int check=1<<i;
        return n|check;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(getBit(n,3));
    }
}


