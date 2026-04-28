package oops;

interface InnerMultipleinhert {
     void display();
}
interface B {
    void display();
    
}
 class InnerMultipleinhert_1 implements InnerMultipleinhert, B {
    public void display(){
        System.out.println("ashish");
    }
}
public class Multipleinhert {
    public static void main(String[] args) {
        InnerMultipleinhert obj = new InnerMultipleinhert_1();
        obj.display();  
    }
}
