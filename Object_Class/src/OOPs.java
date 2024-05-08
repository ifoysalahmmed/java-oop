// Class
class Pen {
    String color;
    String type; // ballpoint; gel

    public void write() {
        System.out.println("writing something");
    }
}

public class OOPs {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        // Object
        pen1.color = "blue";
        pen1.type = "ballpoint";

        pen1.write();
    }
}