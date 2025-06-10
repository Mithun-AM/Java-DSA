package accessModifer1;

public class SubClass extends A{
    public SubClass(int num) {
        super(num);
    }

    public static void main(String[] args) {
        A obj = new A(22);
        int n = obj.num;
        System.out.println(n);
    }
}
