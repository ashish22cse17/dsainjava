package string;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder name=new StringBuilder("ashish");
        System.out.println(name);
        //to string possible for all class like Integer /Character /also for both stringbuilder and stringbuffer
        String name1=name.toString();
        System.out.println(name1);
    }
}
