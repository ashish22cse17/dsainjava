// answer will be f*b+i%C-d*s
////double full here 

public class Resultcheck {
    
    public static void main(String[] args) {
        byte b=4;
    char c='a';
    short s=512;
    int i=1000;
    float f=5.67f;  
    double d = 99.9954;
        double result=(f*b)+(i%c)-(d*s);
        System.out.println(f*b);
        System.out.println(i%c);
        System.out.println(d*s);    
        System.out.println(result);
    }
}
