package string;

public class Substring {
    public static void main(String[] args) {
        String name ="Ashish Ranjan";
        String cut="";
        for (int i = 0; i < 6; i++) {
            cut+=name.charAt(i);
        }
        System.out.println(cut);
        //also we have inbuilt method to do 
        System.out.println(name.substring(0, 8));
    }
}
