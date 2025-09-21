import java.util.Scanner;

public class PermutationCombination_20 {
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    static long permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    static long combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        System.out.println("Permutation (nPr): " + permutation(n, r));
        System.out.println("Combination (nCr): " + combination(n, r));

        sc.close();
    }
}
