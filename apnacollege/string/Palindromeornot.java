package string;

public class Palindromeornot {
    public static boolean ispalin(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String name="moom";
        System.out.println(ispalin(name));
    }

}
