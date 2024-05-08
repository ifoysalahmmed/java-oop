// inheritance
class Shape {
    String color;
}
class Triangle extends Shape {

}

// single level inheritance
//class Shape {
//    public void area() {
//        System.out.println("displays area");
//    }
//}
//
//class Triangle extends Shape {
//    public void area(int l, int h) {
//        System.out.println((1 / 2) * l * h);
//    }
//}

// multi level inheritance
//class Shape {
//    public void area() {
//        System.out.println("displays area");
//    }
//}
//
//class Triangle extends Shape {
//    public void area(int l, int h) {
//        System.out.println((1 / 2) * l * h);
//    }
//}
//
//class EquilateralTriangle extends Triangle {
//    public void area(int l, int h) {
//        System.out.println((1 / 2) * l * h);
//    }
//}

// hierarchical inheritance
//class Shape {
//    public void area() {
//        System.out.println("displays area");
//    }
//}
//
//class Triangle extends Shape {
//    public void area(int l, int h) {
//        System.out.println((1 / 2) * l * h);
//    }
//}
//
//class Circle extends Shape {
//    public void area(int r) {
//        System.out.println(3.14 * r * r);
//    }
//}

// hybrid inheritance

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
//        triangle.color = "red";
    }
}