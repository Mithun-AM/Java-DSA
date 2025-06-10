// https://leetcode.com/problems/set-mismatch/description/

public class setMisMatch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(FindDuplicate(arr));
    }
    public static int[] FindDuplicate(int[] arr) {
        int i = 0;
        while (i<arr.length) {
            int correct =arr[i]-1; 
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        int[] miss = new int[2];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                miss[0] = arr[j];
                miss[1] = j+1;
            }
        }

        return miss;
    }
    public static void swap(int[] arr,int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
