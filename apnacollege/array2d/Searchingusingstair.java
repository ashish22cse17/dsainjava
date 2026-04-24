package array2d;

public class Searchingusingstair {
    public static boolean Stairsearch(int[][] arr,int key){
        int row=0,column=arr[0].length-1;
        while (row<arr.length&&column>=0) {
            if (key==arr[row][column]) {
                return true;
            }
            else if (key<arr[row][column]) {
                column--;
            }
            else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int key=78;
        System.out.println(Stairsearch(arr, key));
        // 1 2 3
        // 4 5 6
        // 7 8 9
    }
}
    