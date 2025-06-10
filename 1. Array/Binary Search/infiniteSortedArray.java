public class infiniteSortedArray {
    public static void main(String[] args) {
        // int[] arr = {2,21,34,56,578,678,3345,5678,23466};
        // int target = 678;
        // System.out.println(ans(arr, target));

        int[] arr = {1,3,4,2};
        System.out.println(peakIndex(arr));
    }

    public static int ans(int[] arr,int target){
        int s = 0;
        int e = 1;

        while (target>arr[e]) {
            int newStart = e+1;

            e = e + (e- s + 1)*2;
            s = newStart;
        }

        return binarySearch(arr, target, s, e);
    }

    public static int binarySearch(int[] arr, int target,int start,int end){
        while (start<=end) {
            int mid = start + (end-start)/2;

            if(target == arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }

    public static int peakIndex(int[] arr){
        int s=0;
        int e=arr.length-1;
        if(arr[e]>arr[e-1]){
            return e;
        }
        if(arr[s]>arr[s+1]){
            return s;
        }
        while (s<=e) {
            int m = s + (e-s)/2;

            if(m<arr.length-1 && m>0 && arr[m]>arr[m-1] && arr[m]>arr[m+1]){
                return m;
            }else if(arr[m]<arr[m+1]){
                s=m+1;
            }else if(arr[m]>arr[m+1]){
                e=m-1;
            }
        }
        return -1;
    }
}
