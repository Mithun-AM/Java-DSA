package interfaces.nestedInterface;

public class A {
    protected interface InnerA {
        boolean isOdd(int num);
    }
}

class InnerA_1 implements A.InnerA{

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }    
}
