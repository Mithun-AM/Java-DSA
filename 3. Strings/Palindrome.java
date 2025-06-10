public class Palindrome {
    public static void main(String[] args){
        String str = "abcdcbaa";
        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String str){
        boolean palindrome = true;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                palindrome = false;
            }
        }

        return palindrome;
    }
}
