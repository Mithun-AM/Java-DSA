
class Test {
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected");
    }

    public static void main(String[] args) {
        Test t = new Test();
        // t = null; // Make object eligible for GC

        A obj = new A("Rnadvsjhv");

        System.out.println(obj);

        for (int i = 0; i < 1000000000; i++) {
        obj = new A("Random name");
        }

        System.gc(); // Suggest JVM to run GC (not guaranteed)
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }
}