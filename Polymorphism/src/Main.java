class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}


public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John";
        student.age = 23;
        student.printInfo(student.name);
        student.printInfo(student.age);
        student.printInfo(student.name, student.age);
    }
}