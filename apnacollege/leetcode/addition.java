package leetcode;
import java.util.ArrayList;
import java.util.List;

public class addition {
    
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Long> numbers = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        long n=0;
        int power =num.length-1;
        for(int i=0;i<num.length;i++){
            
            n=n+(long)(num[i]*Math.pow(10,power));
            power--;
        }
        long l=n+(long)k;
        System.out.println(l);
         while (l > 0) {
            numbers.add(0, l % 10); // add at front
            l = l / 10;
        }

        for (int index = 0; index < numbers.size(); index++) {
            nums.addAll((Integer) numbers.get(index));
        }
        return nums;
    }

    public static void main(String[] args) {
        int num[]={9,9,9,9,9,9,9,9,9,9};
        for (Integer integer : addToArrayForm(num, 1)) {
            System.out.print(integer+" ");
        }
    }
}
