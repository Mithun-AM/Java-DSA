public class Reverse {
    public static void main(String[] args) {
        reverse(3432);
    }

    static void reverse(int n){
        System.out.print((n%10)+"");
        if((n%10)==n){
            return;
        }
        reverse(n/10);
    }
}
