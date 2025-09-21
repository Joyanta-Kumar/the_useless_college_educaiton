class Example {
    public String publicVar = "I am Public";

    protected String protectedVar = "I am Protected";

    String defaultVar = "I am Default (Package-Private)";

    private String privateVar = "I am Private";

    public void showPrivateVar() {
        System.out.println(privateVar);
    }
}

class SubExample extends Example {
    public void display() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
    }
}

public class AccessDemo_5 {
    public static void main(String[] args) {
        Example ex = new Example();

        System.out.println(ex.publicVar);
        System.out.println(ex.protectedVar);
        System.out.println(ex.defaultVar);
        

        ex.showPrivateVar();

        SubExample sub = new SubExample();
        sub.display();
    }
}
