// Person.java
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Student.java
class Student extends Person {
    private String studentID;

    public Student(String name, int age, String studentID) {
        super(name, age); // Call the superclass constructor
        this.studentID = studentID;
    }

    public void displayDetails() {
        super.display(); // Call the display method of Person
        System.out.println("Student ID: " + studentID);
    }
}

// Teacher.java
class Teacher extends Person {
    private String teacherID;

    public Teacher(String name, int age, String teacherID) {
        super(name, age); // Call the superclass constructor
        this.teacherID = teacherID;
    }

    public void displayDetails() {
        super.display(); // Call the display method of Person
        System.out.println("Teacher ID: " + teacherID);
    }
}

// Main.java
public class Hierarchical {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "S12345");
        Teacher teacher = new Teacher("Mr. Brown", 45, "T67890");

        System.out.println("Student Details:");
        student.displayDetails();

        System.out.println("\nTeacher Details:");
        teacher.displayDetails();
    }
}
