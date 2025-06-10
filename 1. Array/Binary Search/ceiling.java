public class ceiling {

    public static int Cieling(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

        if(target == arr[e]){
            return -1;
        }

        while(s<e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                return target;
            }else if(arr[mid] < target){
                s=mid+1;
            }else{
                e=mid;
            }
        }

        return arr[e];
    }
    
    public static int Floor(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

        if(target == arr[s]){
            return -1;
        }

        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                return target;
            }else if(arr[mid] < target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }

        return arr[e];
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,15};
        System.out.println(Cieling(arr,9));;
    }
}
