//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class searchInRoatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,1,2};
        System.out.println(search(nums, 2));
    }

    public static int search(int[] nums, int target){
        // int pivot = findPivot(nums);
        
        // int I = binarySearch(nums,0,pivot,target);
        // if(I == -1){
        //     return binarySearch(nums,pivot+1,nums.length-1,target);
        // }
        // return I;

        int pivot = findPivot(nums);
        if(pivot == -1){
            return binarySearch(nums, 0, nums.length-1, target);
        }
        if(nums[pivot] == target){
            return pivot;
        }else if(target >= nums[0]){
            return binarySearch(nums, 0, pivot-1, target);
        }
        return binarySearch(nums, pivot+1, nums.length-1, target);
    }

    public static int binarySearch(int[] nums, int s,int e, int target){
        while (s<=e) {
            int m = s + (e-s)/2;
            if(nums[m] == target){
                return m;
            }else if(nums[m]<target){
                s = m+1;
            }else{
                e = m-1;
            }     
        }
        return -1;
    }

    
    
    public static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while (s<=e) {
            int mid = s + (e-s)/2;

            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[s]){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return -1;
    }
}
