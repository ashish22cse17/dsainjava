package oops;
class InnerConstructor {
    int age;
    String name;
    int marks[]=new int[5];

    InnerConstructor(){// deafult constructor
        age=12;
        name="Ashish Ranjan"; 
        for (int i = 0; i < marks.length; i++) {
            marks[i]=i+2;
        }
        // System.out.println("in constructor");
    }
    InnerConstructor(int age,String name){// parameterized constructor
        this.age=age;
        this.name=name; 
        System.out.println("in constructor");
    }

    //copy constructor
    InnerConstructor(InnerConstructor s1){
        this.age=s1.age;
        this.name=s1.name;
        this.marks=s1.marks;
    }


}
public class Constructor {
    
    public static void main(String[] args) {
        InnerConstructor obj=new InnerConstructor();
        // System.out.println(obj.age);
        // System.out.println(obj.name);
        InnerConstructor obj1=new InnerConstructor(obj);
        System.out.println(obj1.age);
        System.out.println(obj1.name);
        System.out.println(obj1.marks[0]);
    }
}
