import java.util.Scanner;

public class Grading_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input marks
		System.out.print("Enter the marks (0-100): ");
		int marks = sc.nextInt();

		char grade;

		// Grading logic
		if (marks >= 90 && marks <= 100) {
			grade = 'A';
		} else if (marks >= 80) {
			grade = 'B';
		} else if (marks >= 70) {
			grade = 'C';
		} else if (marks >= 60) {
			grade = 'D';
		} else if (marks >= 0) {
			grade = 'F';
		} else {
			System.out.println("Invalid marks entered!");
			sc.close();
			return;
		}

		System.out.println("Grade: " + grade);

		sc.close();
	}
}
