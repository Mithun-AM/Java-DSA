// https://leetcode.com/problems/missing-number/

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(CycleSort(arr));
    }

    public static int CycleSort(int[] arr) {
        int i = 0;
        while (i<arr.length) {
            int correct =arr[i]; 
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(i,correct,arr);
            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }

        return arr.length;
    }

    public static void swap(int s, int e, int[] arr){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
