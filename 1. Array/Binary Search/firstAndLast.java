//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Arrays;

public class firstAndLast {
    public static void main(String[] args) {

        int[] arr = {2,3,4,4,5,6,7,7,7,8,9};
        int target = 7;
        searchRange(arr,target);
        System.out.println(Arrays.toString(searchRange(arr,target)));

    
    }
    public static int[] searchRange(int[] nums, int target) {
        
        int[] arr = {-1,-1};
        arr[0] = search(nums,target,true);    
        if(arr[0] != -1){
            arr[1] = search(nums,target,false);        
        }    

        return arr;
    }

    static int search(int[] nums, int target, boolean findFirstIndex){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;

            if(nums[mid] == target){
                ans=mid;
                if(findFirstIndex){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }else if(nums[mid]>target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }
}
