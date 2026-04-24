package string;

public class Lexcomp {
    
    public static void main(String[] args) {
        String arr[]={"mango","litchi","apple"};
        String lar=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(lar.compareTo(arr[i])<0){
                lar=arr[i];
            }
        }
        System.out.println(lar);
    }
}
