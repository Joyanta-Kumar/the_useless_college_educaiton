import java.util.Scanner;

public class AreaCalculator_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + (Math.PI * r * r));

        System.out.print("Enter base and height of triangle: ");
        double b = sc.nextDouble(), h = sc.nextDouble();
        System.out.println("Area of Triangle: " + (0.5 * b * h));

        System.out.print("Enter length and width of rectangle: ");
        double l = sc.nextDouble(), w = sc.nextDouble();
        System.out.println("Area of Rectangle: " + (l * w));

        sc.close();
    }
}
