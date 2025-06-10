// https://leetcode.com/problems/first-missing-positive/

public class firstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        System.out.println(FirstMissingPositive(arr));
    }

    public static int FirstMissingPositive(int[] nums) {
        int i=0;
        while (i<nums.length) {
            int crt = nums[i]-1;
            if(nums[i] < nums.length && nums[i]>0 && nums[i] != nums[crt]){
                swap(nums, i, crt);
            }else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                return j+1;
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
