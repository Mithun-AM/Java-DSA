import java.util.ArrayList;
import java.util.Arrays;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+4));
        
        System.out.println("a"+1);
        
        System.out.println("Hi"+ new ArrayList<>());

        

        System.out.println(new Integer(56)+""+ new ArrayList<>());

        // System.out.println(new Integer(56)+ new ArrayList<>());
        // The above line will not compile because the + operator is not defined for Integer and ArrayList.
        //While concatenating an object there should be atleast one string in the expression.
        // The + operator is overloaded in Java for String concatenation, but it does not work with other object types directly.


        String str = "Hello Hi How Are You?";
        System.out.println(Arrays.toString(str.split(" "))); 
    }
}