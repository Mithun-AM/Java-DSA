package OOPs6.LamdaFunction;

public class Lamda {
    public static void main(String[] args) {
        Operation sum = (a,b) -> a+b;
        Operation sub = (a,b) -> a-b;
        
        Operation mul = (a,b) -> a*b;
        // is equal to: SHORTHAND
        // Operation mul = new Operation() {
        //     public int operation(int a, int b) {
        //         return a * b;
        //     }
        // };
        //The lambda (a, b) -> a * b automatically provides the implementation for the operation() method in the Operation interface.
 
        Lamda myCal = new Lamda();
        System.out.println(myCal.operate(5, 3, mul));
        System.out.println(myCal.operate(5, 3, sum));
        System.out.println(myCal.operate(5, 3, sub));
    }

    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}

interface Operation{
    int operation(int a,int b);
}
