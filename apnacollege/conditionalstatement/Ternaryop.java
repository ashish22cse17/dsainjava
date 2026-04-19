package conditionalstatement;

public class Ternaryop {
    public static void main(String[] args) {
        int a=9;
        int b=11;
        // condition ? true : false
        String res=(a>b)?"yes a is larger than b":"no b is larger than a";
        System.out.println(res);
    }
}
