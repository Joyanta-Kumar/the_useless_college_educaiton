class Vehicle {
    void move() {
        System.out.println("Vehicle can move");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car moves on four wheels");
    }
}

class Bike extends Vehicle {
    @Override
    void move() {
        System.out.println("Bike moves on two wheels");
    }
}

public class SuperclassReference_12 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.move();
        v2.move();
    }
}
