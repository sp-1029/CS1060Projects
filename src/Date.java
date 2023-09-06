import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type or my family will die");
        String line = scanner.nextLine();
        System.out.println("you typed: " + line);

        System.out.println("number or my family will die");
        int number = scanner.nextInt();
        System.out.println("your number: " + number);

        System.out.println("your number squared is: " + number * number);
    }
}
