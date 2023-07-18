// polymorphism - many ways to represent 
// types - compile time/static polymorphism - method/operator(not in java) overloading
// run-time/dynamic polymorphism - method overriding
// late binding, early binding - when the method declared is final as it can be resolved during compile time
// final - prevents overriding, inheritance, if a class is declared final it will implicitly declare its method final too
// encapsulation - wrapping up the implementation of data members and methods in class, implementation level issue, internal working, containing info., using getters and setters
// abstraction - hiding the unnecessary details and showing valuable info., design issue, gaining info.
// data hiding - private, data security

public class Con5 {
    public static void main(String[] args) {
        // Shapes obj = new Shapes();
        // Circle cir = new Circle();
        // obj.area();
        // cir.area();

        // how overriding works?
        Shapes obj = new Square();
        obj.area(); // upcasting, dynamic method dispatch - call to an overridden method is resolved
                    // at runtime rather than on compile time

        System.out.println(obj);
    }
}

class Shapes {
    // final prevents method overriding early binding
    void area() {
        System.out.println("I am in shapes!");
    }

    @Override
    public String toString() {
        return "Shapes Jyoti";
    }
}

class Circle extends Shapes {
    @Override // annotation
    void area() {
        System.out.println("I am in Circle!");
    }
}

class Triangle extends Shapes {
    void area() {
        System.out.println("I am in Triangle!");
    }
}

class Square extends Shapes {
    void area() {
        System.out.println("I am in Square!");
    }
}
