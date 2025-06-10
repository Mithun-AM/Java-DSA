//https://leetcode.com/problems/find-in-mountain-array/

public class mountainArray {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,1};
        System.out.println(findInMountainArray(arr, 3));;
    }

    public static int findInMountainArray(int[] arr,int target) {
        int peak = binarySearchForPeak(arr);
        int l = findIndex(target,0,peak,arr);
        if(l != -1){
            return l;
        }else{
            int r = findIndex(target,peak+1,arr.length-1,arr);
            return r;
        }
    }

    public static int findIndex(int target, int l, int r,int[] arr){
        if(arr[l]<arr[r]){
            while(l<=r){
                int mid = l + (r-l)/2;
                if(arr[mid] == target){
                    return mid;
                }else if(arr[mid] > target){
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }
            return -1;
        }else{
            while(l<=r){
                int mid = l + (r-l)/2;
                if(arr[mid] == target){
                    return mid;
                }else if(arr[mid] > target){
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }
            return -1;
        }
    }

    public static int binarySearchForPeak(int[] arr){
        int s = 0;
        int e = arr.length-1;
        
        while(s<e){
            int mid = s + (e-s)/2;

            if(arr[mid]>arr[mid+1]){
                e = mid;
            }else{
                s = mid+1;
            }
        }
        return e;
    }
}
