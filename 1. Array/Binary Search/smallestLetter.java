//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class smallestLetter {

    public static char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length-1;
        // if(target>=letters[e]){
        //     return letters[s];
        // }

        while(s<=e){
            int mid = s + (e-s)/2;
        
            if(letters[mid] > target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }

        return letters[s%letters.length];
    }

    public static void main(String[] args) {
        char[] arr = {'a','c','f','r','z'};
        System.out.println(nextGreatestLetter(arr,'c'));
    }
}
