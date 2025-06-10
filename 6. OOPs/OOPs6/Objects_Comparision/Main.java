package OOPs6.Objects_Comparision;

public class Main {
    public static void main(String[] args) {
        Student mithun = new Student(2, 213.4f);
        Student abhi = new Student(2, 32.2f);

        if(mithun.compareTo(abhi) < 0){
            System.out.println("Mithun < Abhi");
        }else{
            System.out.println("Mithun > Abhi");
        }
    }
}
