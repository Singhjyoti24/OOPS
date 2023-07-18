// class, object, this, constructor overloading, final, reference and instance variable, wrapper class, finalize(gc)

public class Con1 {
    public static void main(String[] args) {
        Student st1 = new Student(38, "Jyoti Singh", 89.4f);
        System.out.println(st1.name);

        Student st2 = new Student();
        System.out.println(st2.name);
        System.out.println(st2.INCREASE);

        Student st3 = new Student(st1);
        System.out.println(st3.name);
    }
}

class Student {
    final int INCREASE = 2;
    int rno;
    String name;
    float marks;

    Student() {
        this(0, "default person", 0.0f);
    }

    Student(Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    public void greeting() {
        System.out.println("Hello! " + name);
    }
}