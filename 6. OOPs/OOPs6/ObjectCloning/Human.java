package OOPs6.ObjectCloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,5,6};
    }

    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    public Object clone() throws CloneNotSupportedException{
        //This is shallow copy
        return super.clone();


        // this is deep copy
        // Human twin = (Human) super.clone();//This is actually shallow copy

        //make deep copy for refernces
        // twin.arr = new int[twin.arr.length];
        // for (int i = 0; i < twin.arr.length; i++) {
        //     twin.arr[i] = this.arr[i];
        // }

        // return twin;
    }

}
