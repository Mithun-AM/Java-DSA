/**
 * The {@code Student} class represents a student with a name and age.
 * <p>
 * This class demonstrates various uses of the {@code this} keyword in Java:
 * <ul>
 *   <li>Referring to instance variables when local variables shadow them.</li>
 *   <li>Invoking another constructor in the same class using {@code this()}.</li>
 *   <li>Passing the current object as an argument to other methods or classes.</li>
 *   <li>Returning the current object for method chaining.</li>
 * </ul>
 * <p>
 * Example usage:
 * <pre>
 *     Student s1 = new Student("Alice", 20);
 *     s1.display();
 *     s1.updateName("Bob").display();
 *     s1.printSelf();
 * </pre>
 */
class Student {
    String name;
    int age;

    // 1. Use 'this' to refer to instance variables
    Student(String name, int age) {
        this.name = name;       // 'this.name' = instance variable
        this.age = age;         // 'age' is local variable (parameter)
    }

    // 2. Use 'this()' to call another constructor
    Student(String name) {
        this(name, 18);  // Calls the above constructor, sets default age to 18
    }

    // 3. Use 'this' to pass current object as argument
    /**
     * Prints the details of the current object by passing it to the Helper class's showStudent method.
     * This method allows external classes to access and display the state of this object.
     */
    void printSelf() {
        Helper.showStudent(this);  // passing current object to another class
    }

    // 4. Use 'this' to return current object
    Student updateName(String newName) {
        this.name = newName;
        return this;  // used for method chaining
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Helper {
    static void showStudent(Student s) {
        System.out.println("From Helper: Name = " + s.name + ", Age = " + s.age+1);
    }
}

public class Main {
    public static void main(String[] args) {
        // 1 & 2: Using 'this' to assign instance variables and call another constructor
        Student s1 = new Student("Mithun");
        s1.display();  // Output: Name: Mithun, Age: 18

        // 3: Pass current object using 'this'
        s1.printSelf();  // Output from Helper class

        // 4 & 5: Return current object and method chaining
        s1.updateName("Mithun A M").display();  // Method chaining
    }
}