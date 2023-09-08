import java.util.Scanner;

public class InteractiveGreeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where are you from?");
        String place = scanner.nextLine();
        System.out.println("How old are you? (years)");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hello " + name + " from " + place + ", you are " + age + " years old");
        System.out.println("What is your favorite activity?");
        String activity = scanner.nextLine();
        System.out.println("Have fun the next time you " + activity + "!");
        System.out.println("How much would you like to donate today? (dollars)");
        double donate = scanner.nextDouble();
        System.out.println("you will donate $" + donate + " today, yay!");

    }
}
