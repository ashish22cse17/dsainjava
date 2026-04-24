package string;

import java.util.Scanner;

public class Syntax {
    public static void main(String[] args) {
        String name="ashish";//string are immutable
        System.out.println(name);

        String name1=new String();
        Scanner sc=new Scanner(System.in);
        // name1=sc.next();only take one word
        name1=sc.nextLine();//take whole sentence

        //length
        int n=name.length();
        System.out.println(n);
        //equals
        boolean t=name.equals(name1);
        System.out.println(t);

    }
}
