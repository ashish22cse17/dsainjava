package oops;
abstract class InnerAbsclass {

    public abstract void display();
}

class InnerAbsclass_1 extends InnerAbsclass { //concrate class
    public void display() {
        System.out.println("ashish");
    }
}

public class Absclass {
    public static void main(String[] args) {
        InnerAbsclass obj = new InnerAbsclass_1();
        obj.display();
    }
}
