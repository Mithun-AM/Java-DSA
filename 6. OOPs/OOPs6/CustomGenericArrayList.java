package OOPs6;

import java.rmi.server.ObjID;
import java.util.Arrays;

// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects

public class CustomGenericArrayList<T> {
    private Object[] data;
    private int size = 0; //also working as index value
    private static int DEFAULT_SIZE = 10;

    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }

        data[size++] = num; 
    }

    private void resize() {
        Object temp[] = new Object[size*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return data.length == size;
    }

    public T remove(){
        T removed = (T)data[size-1];
        data[size-1] = null;
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    public String toString(){
        return "CustomArrayList { data =" + Arrays.toString(data) + "}";
    }

    public static void main(String[] args) {

        // FOR INTEGERS
        // CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();

        // for (int i = 0; i < 18; i++) {
        //     list.add(i*3);
        // }

        // System.out.println(list.toString());

        // list.remove();
        // // list.add(2);
        // System.out.println(list.toString());
        // System.out.println(list.get(2));
        // System.out.println(list.size());
        
        // list.set(2, 77);
        // System.out.println(list.toString());


        // FOR STRINGS
        CustomGenericArrayList<String> list = new CustomGenericArrayList<>();

        for (int i = 0; i < 18; i++) {
            list.add("String" + i);
        }

        System.out.println(list.toString());

        list.remove();
        // list.add(2);
        System.out.println(list.toString());
        System.out.println(list.get(2));
        System.out.println(list.size());
        
        list.set(2, "New");
        System.out.println(list.toString());
    }
}
