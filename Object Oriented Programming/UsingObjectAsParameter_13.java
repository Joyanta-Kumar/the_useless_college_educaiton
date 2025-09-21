class Number_13 {
    int value;

    Number_13(int value) {
        this.value = value;
    }

    boolean isEqual(Number_13 n) {
        return this.value == n.value;
    }
}

public class UsingObjectAsParameter_13 {
    public static void main(String[] args) {
        Number_13 n1 = new Number_13(10);
        Number_13 n2 = new Number_13(10);
        Number_13 n3 = new Number_13(20);

        System.out.println("n1 == n2: " + n1.isEqual(n2));
        System.out.println("n1 == n3: " + n1.isEqual(n3));
    }
}
