package functionmethods;

public class Swap {
    //in always uses call by value not reference
    public static int swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+":"+b);
        return a;
    }
    public static void main(String[] args){
        int a=6;
        int b=34;
        swap(a, b);
        System.out.println(a +" : "+ b);

    }
}
