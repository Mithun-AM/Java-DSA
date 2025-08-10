public class Concept {
    public static void main(String[] args) {
        prod(5);
    }

    static void prod(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        prod(--n);
    }
}

