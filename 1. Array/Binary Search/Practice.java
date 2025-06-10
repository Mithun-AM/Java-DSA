import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,5,6,7,7,7,8,9};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }

    public static int[] searchRange(int[] arr, int target){
        
        int[] ans = {-1,-1};

        ans[0] = search(arr, target, true);
        if(arr[0] != -1){
            ans[1] = search(arr, target, false);
        }
        return ans;
    }

    public static int search(int[] arr, int target, boolean findFirstIndex){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s<=e){
            int m = s + (e-s)/2;

            if(arr[m] == target){
                ans = m;
                if(findFirstIndex){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }else if(arr[m]>target){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return ans;
    }
}
