//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

//https://leetcode.com/problems/find-peak-element/description/

public class findInPeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] arr) {
        int s = 0;
        int e = arr.length-1;

        while (s<e) {
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
