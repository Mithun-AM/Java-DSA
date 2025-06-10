import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5,1,2,3,4 };
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            
            boolean swap = true;
            for (int j = 1; j < arr.length - i ; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap=false;
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            if(swap){
                return;
            }
        }
    }
}