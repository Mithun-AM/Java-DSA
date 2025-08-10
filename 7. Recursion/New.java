public class New {
// PLaindrome
    public static void main(String[] args) {
        System.out.println(pal(3245));
    }

    static boolean pal(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return n == rev(n,digits);
    }

    static int rev(int n, int digits){
        if(n%10 == n){
            return n;
        }

        int rem = n%10;
        return rem*(int)Math.pow(10, digits-1) + rev(n/10, digits-1);
    }

}
