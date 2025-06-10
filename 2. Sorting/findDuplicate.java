//https://leetcode.com/problems/find-the-duplicate-number/description/

public class findDuplicate {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(FindDuplicate(arr));
    }
    public static int FindDuplicate(int[] arr) {
        int i=0;
        while (i<arr.length) {
            if (arr[i] != i+1) {
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]){
                    swap(arr,i,correct);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }

      
        return -1;
    }
    public static void swap(int[] arr,int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}