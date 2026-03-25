

package OOPs.constructors;

class Student {

    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
        System.out.println("Hello " + this.name + " your roll is " + roll);
    }

    Student() {
        System.out.println("non paramateraised constructor");
    }
}

public class Constructor_demo {
    public static void main(String[] args) {
        
        Student obj = new Student(46, "Sourav");
        Student obj2 = new Student();
    }
}
