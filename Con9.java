// interface
public class Con9 {
    public static void main(String[] args) {
        Car car = new Car();
        car.acc();
        car.hello();
    }
}

class Car implements Media, Brake, Engine{

    @Override
    public void acc() {
        System.out.println("I am accelerating");
    }

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'brake'");
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }

}

interface Media {
    default void hello(){
        System.out.println("knvkfnvk");
    }

    void start();

    void stop();
}

interface Brake {
    void brake();
}

interface Engine {
    static final int price = 78000;

    void start();

    void stop();

    void acc();
}