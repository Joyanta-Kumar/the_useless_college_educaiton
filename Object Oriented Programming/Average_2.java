import java.util.Scanner;


public class Average_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many numbers do you have? ");
    int count = scanner.nextInt();
    float sum = 0.0F;
    float[] numbers = new float[count];

    for (int i = 0; i < count; i++) {
      System.out.print(String.format("Number %d: ", i+1));
      numbers[i] = scanner.nextFloat();
      sum += numbers[i];
    }
    float average = sum / (float) count;
    scanner.close();

    System.out.println("Average is: " + average);
  }
  
}
