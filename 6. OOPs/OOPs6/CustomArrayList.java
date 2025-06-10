package OOPs6;

import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement.DEFAULT;

public class CustomArrayList {
    
    private int[] data;
    private int size = 0;
    private static int DEFAULT_SIZE = 10;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    private void resize() {
        int temp[] = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i]; 
        }
        data = temp;
    }

    private boolean isFull() {
        return data.length == size;
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    public String toString(){
        return "CustomArrayList { data =" + Arrays.toString(data) + "}";
    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();

        CustomArrayList list = new CustomArrayList();

        list.add(5);
        list.add(2);
        list.add(54);

        for (int i = 0; i < 18; i++) {
            list.add(i*3);
        }

        System.out.println(list.toString());
    }
}
