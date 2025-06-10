package OOPs6.ExceptionHandling;

public class ExcepHandling {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;

        try {
            String name = "Mithun";
            if (name.equals("Mithun")) {
                throw new CustomException("Name is Mithun Change it");
            }
            divide(a, b);
        }catch (CustomException e) {//Multiple catch block can be created
            System.out.println("Exception : "+ e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Exception : "+ e.getMessage());
        }finally{//Only one finally block can be created
            System.out.println("Executes everytime if Error present or not");
        }


        System.out.println("After error");
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Don't divide by zero");
        }

        return a/b;
    }
}
