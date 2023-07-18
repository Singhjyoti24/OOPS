// package, import, static
// InnerClasses - outside classes cannot be static as they don't depend on any other, inside the class static classes can be made

public class Con2 {
    // if not made static then depend on objects of Con2
    static class A {
        A() {
            System.out.println("Constructor");
        }
    }

    public static void main(String[] args) {
        // Human obj1 = new Human(20, "Jyoti", 35000, false);
        // Human obj2 = new Human(20, "Jyoti", 35000, false);
        // Human obj3 = new Human(20, "Jyoti", 35000, false);
        // System.out.println(Human.population);

        // greeting(); can't access non-static method inside static method
        // A obj = new A();
    }

    public static void fun() {
        // we can access non-static method inside static method by creating instances
        Con2 obj = new Con2();
        obj.greeting();
    }

    public void greeting() {
        fun();
        System.out.println("Hello guys!");
    }
}

class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static int population;

    public static void message() {
        System.out.println("Good night!");
        // System.out.println(this.age); you can't use this inside static as static
        // methods don't require objects and this refers to objects
    }

    Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;
    }
}
