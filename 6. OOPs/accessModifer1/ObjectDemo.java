package accessModifer1;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // already covered these 2
    @Override
    public String toString() {
        // return super.toString();
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    // we will go in details of how to create it in hashmap lecture
    /**
     * Returns a hash code value for the object.
     * <p>
     * This implementation delegates to the superclass's {@code hashCode()} method.
     * Override this method to provide a custom hash code based on the object's fields.
     *
     * @return the hash code value for this object
     */
    @Override
    public int hashCode() {
        return super.hashCode();
        // return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(12, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(12, 78.9f);

        if (obj1 == obj2) {
            System.out.println("obj1 is equal to obj2");
        }

        if (obj1.equals(obj2)) {
            System.out.println("obj1 is equal to obj2");
        }
        
        System.out.println(obj1 instanceof ObjectDemo);
        
        System.out.println(obj1.getClass().getName());
    //    System.out.println(obj1.hashCode());
    //    System.out.println(obj2.hashCode());
    }

}