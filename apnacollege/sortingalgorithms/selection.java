package sortingalgorithms;

public class selection {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }
    public static void main(String[] args) {
        int ar[] = { 3, 2, 1,98,90,45 };
        selectionSort(ar);
        for (int i : ar) {
            System.out.print(i + " ");
        }
    }
}
