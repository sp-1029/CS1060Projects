import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the grade?");
        double grade = scanner.nextDouble();
        if (grade < 0) {
            System.out.println("Error");
        } else if (grade < 60) {
            System.out.println("Your grade is an F");
        } else if (grade < 67) {
            System.out.println("Your grade is a D");
        } else if (grade < 69) {
            System.out.println("Your grade is a D+");
        } else if (grade < 72) {
            System.out.println("Your grade is a C-");
        } else if (grade < 77) {
            System.out.println("Your grade is a C");
        } else if (grade < 79) {
            System.out.println("Your grade is a C+");
        } else if (grade < 82) {
            System.out.println("Your grade is a B-");
        } else if (grade < 87) {
            System.out.println("Your grade is a B");
        } else if (grade < 89) {
            System.out.println("Your grade is a B+");
        } else if (grade < 92) {
            System.out.println("Your grade is an A-");
        } else {
            System.out.println("Your grade is an A");
        }
    }
}