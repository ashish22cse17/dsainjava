package leetcode;

public class CompressString {
    ///not working as i am not modifying the original char array..
    public static int compress(char ch[]) {
        String str="";
        for (int i = 0; i < ch.length; i++) {
            str=str+ch[i];
        }
        String newStr = "";
        // aaabc
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();

            }
        }
        return newStr.length();
    }

    public static void main(String[] args) {
        char name[]={'a','b','b','b','b','b','b','b','b','b','b','b','b'};

        System.out.println(compress(name));
    }
}

