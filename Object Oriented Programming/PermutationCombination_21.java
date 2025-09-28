import java.util.Scanner;

public class PermutationCombination_21 {
    
    // factorial method
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        
        System.out.print("Enter value of r: ");
        int r = sc.nextInt();
        
        if (n < r) {
            System.out.println("n must be greater than or equal to r.");
        } else {
            long permutation = factorial(n) / factorial(n - r);
            long combination = factorial(n) / (factorial(r) * factorial(n - r));
            
            System.out.println("Permutation P(" + n + "," + r + ") = " + permutation);
            System.out.println("Combination C(" + n + "," + r + ") = " + combination);
        }
        
        sc.close();
    }
}
