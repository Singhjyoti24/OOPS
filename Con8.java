// Abstract class - can't create object of abstract class, static abstract methods can't be created 

public class Con8 {
    public static void main(String[] args) {
        Son obj = new Son(25);
        obj.career("IAS");
        obj.partner("XYZ", 26);

        Parent.hello();
    }
}

class Son extends Parent {
    Son(int age) {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("I am going to be " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("Partner's name is " + name + " and age is " + age);
    }
}

abstract class Parent {
    int age;
    final int VALUE;

    Parent(int age) {
        this.age = age;
        VALUE = 4;
    }

    static void hello(){
        System.out.println("Hey everyone!");
    }

    abstract void career(String name);

    abstract void partner(String name, int age);
}
