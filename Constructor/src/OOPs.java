class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // non-parameterized constructor
//    Student() {
//        System.out.println("constructor called");
//    }

    // parameterized constructor
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    // copy constructor
    Student(Student student4) {
        this.name = student4.name;
        this.age = student4.age;
    }

    Student() {

    }
}

public class OOPs {
    public static void main(String[] args) {
        // non-parameterized constructor
//        Student student = new Student();
//        student.name = "John";
//        student.age = 22;
//        student.printInfo();

        // parameterized constructor
//        Student student2 = new Student("John",22);
//        student2.printInfo();

        // copy constructor
        Student student3 = new Student();
        student3.name = "John";
        student3.age = 22;

        Student student4 = new Student(student3);
        student4.printInfo();
    }
}