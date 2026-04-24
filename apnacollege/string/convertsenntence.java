package string;

public class convertsenntence {
    public static String conveter(String s){
        StringBuilder name=new StringBuilder("");
        char ch=Character.toUpperCase(s.charAt(0));
        name.append(ch);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i)==' '&&i<s.length()-1) {
                name.append(s.charAt(i));
                i++;
                name.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                name.append(s.charAt(i));
            }
        }
        
        return name.toString();
    }
    public static void main(String[] args) {
        String name="i am all alone";
        System.out.println(conveter(name));
    }
}
