public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(prod(123321));
    }

    static int prod(int n){
        if((n%10)==0){
            return n;
        }
        return prod(n/10) + (n%10);
    }
}

