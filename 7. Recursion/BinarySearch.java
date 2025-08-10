public class BinarySearch {
    
    public static int binary(int s, int e, int arr[], int search){
        if(s>e){
            return -1;
        }
        int m = (s+e)/2;
        if(arr[m] == search){
            return m + 1;
        }else if (arr[m] < search) {
            return binary(m+1, e, arr, search);
        }
        return binary(s, m-1, arr, search);
    }
    
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,9};
        System.out.println(binary(0, arr.length, arr, 0));
    }
}
