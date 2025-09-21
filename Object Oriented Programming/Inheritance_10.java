class Shape {
    double area() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
}

public class Inheritance_10 {
    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r = new Rectangle(10, 5);
        Square sq = new Square(6);

        System.out.println("Shape area: " + s.area());
        System.out.println("Rectangle area: " + r.area());
        System.out.println("Square area: " + sq.area());
    }
}
