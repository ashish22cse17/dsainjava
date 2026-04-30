package recursion;

public class NthFibo {
    public static int printNth(int n){
        if(n==0||n==1){
            return n;
        }
      
        return printNth(n-2)+printNth(n-1);
        
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(printNth(n));
    }
}
