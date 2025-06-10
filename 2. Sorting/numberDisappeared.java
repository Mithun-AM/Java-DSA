// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class numberDisappeared {

    public static void main(String[] args) {
        int[] arr ={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));;
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> dis = new ArrayList<>();
        int i=0;
        while (i<arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(j+1 != arr[j]){
                dis.add(j+1);
            }
        }

        return dis;
    }

    public static void swap(int[] arr, int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}