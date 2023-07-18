// Inheritance, super keyword
// Types of inheritance: Single inheritance, Multilevel inheritance
// Multiple inheritance - one class is extending more than one class - not allowed in java
// hierarchial inheritance - one class is extended by many classes
// hybrid inheritance - combination of single and multiple, not allowed in java (interfaces)

public class Con4 {
    public static void main(String[] args) {
        // Box box1 = new Box(5);
        // System.out.println(box1.l);

        // BoxWeight box2 = new BoxWeight();
        // BoxWeight box3 = new BoxWeight(2, 3, 4, 5);
        // System.out.println(box3.h);

        Box box4 = new BoxWeight(2, 3, 4, 5);
        // System.out.println(box4.weight); type of reference variable determines
        // which memebers can be accessed not the object
        System.out.println(box4.h);

        // BoxWeight box5 = new Box(3,4,5); ---> child ref. var. and object parent not
        // allowed

    }
}

class BoxPrice extends BoxWeight {
    double cost;

    BoxPrice() {
        this.cost = -1;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight() {
        System.out.println("BoxWeight constructor");
        this.weight = -1;
    }

    BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }
}

class Box {
    private double l;
    double h;
    double w;

    Box() {
        super(); // object
        System.out.println("Box constructor");
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(int side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // copy constructor
    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box!");
    }
}
