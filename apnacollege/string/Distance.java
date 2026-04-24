package string;

public class Distance {
    public static double shortestDirection(String s) {
        int y=0,x=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'N') {
                y++;
            } else if (s.charAt(i) == 'E') {
                x++;
            } else if (s.charAt(i) == 'W') {
                x--;
            } else {
                y--;
            }
        }

        return Math.sqrt((x*x)+(y*y));
    }

    public static void main(String[] args) {
        String name="WNEENESENNN";
        System.out.println(shortestDirection(name));
    }
}
