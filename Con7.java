// Object

public class Con7 {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.hashCode());
    }
}

class ObjectDemo {
    int num;

    ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        // super.finalize();
    }
}
