// initilisation of static variables
// Singleton - only 1 object

public class Con3 {
    static int a = 4;
    static int b;

    // will run once, when the first object is created
    static {
        System.out.println("Inside static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        // System.out.println(a + " " + b);

        // Con3.b += 5;
        // System.out.println(a + " " + b);

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1 + " " + obj2);
    }
}

class Singleton {
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
