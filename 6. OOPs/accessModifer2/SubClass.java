package accessModifer2;

import accessModifer1.A;

public class SubClass extends A{

    SubClass(int num) {
        super(num);
    }

    public static void main(String[] args) {
        A obj = new A(23);
        int n = obj.num;
        
        SubClass obj1 = new SubClass(23);
        int n1 = obj1.num;
    }
    
}
