import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 5,0,-4,3,-2,1};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // public static void SelectionSort(int[] arr){
    //     for (int i = 0; i < arr.length-1; i++) {
    //         int small = i;
    //         for(int j=i+1; j<arr.length;j++){
    //             if(arr[j]<arr[small]){
    //                 small = j;
    //             }
    //         }
    //         int temp = arr[i];
    //         arr[i] = arr[small];
    //         arr[small] = temp;
    //     }
    // }

    public static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int large = arr.length-1-i;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[large]){
                    large = j;
                }
            }
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[large];
            arr[large] = temp;
        }
    }
}
