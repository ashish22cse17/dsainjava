package bitmanipulation;

public class ithbit {
    public static int getBit(int n,int i){
        int check=1<<i;
        if ((n&check)==0) {
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(getBit(n,3));
    }
    
}
