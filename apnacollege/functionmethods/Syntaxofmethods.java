package functionmethods;

public class Syntaxofmethods {
    public static void demfun(){//without input parameters
        System.out.println("syntax of funtion in java");
    }
    public static int sum(int a,int b){//patameters or formal patameters
       return a+b;
    }
    public static void main(String[] args) {
        demfun();
        System.out.println(sum(4,6)); //arguments or actual patameters
    }
}
