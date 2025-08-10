package OOPs6.ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human abhi = new Human(23,"Abhi");
        //Cloning manually
        // Human twin = new Human(abhi);

        Human twin = (Human)abhi.clone();

        System.out.println(twin.age+ " "+ twin.name);

        System.out.println(Arrays.toString(twin.arr));
        
        twin.arr[0] = 100;
        
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(abhi.arr));

    }
}

