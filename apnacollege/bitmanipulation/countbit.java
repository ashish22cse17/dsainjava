package bitmanipulation;

public class countbit {
    public static void main(String[] args) {
        int count=0;
        int n=16;
        while (n>0) {
            if((n&1)!=0){
                count++;
            }
           n=n>>1;
            
        }
        System.out.println(count);
    }
}
