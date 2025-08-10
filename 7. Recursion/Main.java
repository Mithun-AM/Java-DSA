public class Main{
    public static void main(String[] args) {
        print(1);
        printc(1,5);
    }

    public static void printc(int i,int n){
        System.out.println(i);
        if (i==n) {
            return;
        }
        printc(i+1,n);
    }

    public static void print(int n){
        System.out.println(n);
        if(n==5){
            return;
        }
        print(n+1);
    }
}