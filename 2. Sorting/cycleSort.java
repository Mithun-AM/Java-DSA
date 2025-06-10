import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        CycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void CycleSort(int[] arr) {
        int i = 0;
        while (i<arr.length) {
            int correct =arr[i]-1; //ASCENDING
            // int correct =arr.length - arr[i]; //DESCENDING
            if(arr[i] != arr[correct]){
                swap(i,correct,arr);
            }else{
                i++;
            }
        }
    }

    public static void swap(int s, int e, int[] arr){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}