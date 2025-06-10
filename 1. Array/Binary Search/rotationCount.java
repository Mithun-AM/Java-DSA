public class rotationCount {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,0};
        int pivot = findPivot(arr);
        System.out.println("pivot="+pivot);
        
        System.out.println(pivot+1);
        
    }

    public static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while (s<=e) {
            int mid = s + (e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }else if (mid>s && arr[mid]<arr[mid-1]) {
                return mid-1;
            }else if (arr[mid]<=arr[s]) {
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}
