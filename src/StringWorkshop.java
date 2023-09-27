import java.util.Scanner;
public class StringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a string");
        String string = scanner.nextLine();
        boolean notExited = true;
        while (notExited){
            System.out.println("Type a number corresponding to an action");
            System.out.println("1: Add more content to the string");
            System.out.println("2: Check if a string contains a substring");
            System.out.println("3: Output the length of the string");
            System.out.println("4: Output the substring after a given prefix");
            System.out.println("5: Output the substring before a given suffix");
            System.out.println("6: Output the substring before and after a given prefix and suffix");
            System.out.println("7: Exit the program");
            int selection = scanner.nextInt();
            if (selection == 1) {
                string = add(string);
                System.out.println("Current string: " + string);
            } else if (selection == 2) {
                checkSubstring(string);
            } else if (selection == 3) {
                length(string);
            } else if (selection == 4) {
                afterPrefix(string);
            } else if (selection == 5) {
                beforeSuffix(string);
            } else if (selection == 6) {
                inbetweenPreAndSuf(string);
            } else if (selection == 7) {
                notExited = false;
            }
        }
    }
    public static String add(String string){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to add to the string?");
        string = string + scanner.next();
        return string;
    }

    public static void checkSubstring(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What substring do you want to check for?");
        String substring = scanner.next();
        if (string.contains(substring)) {
            System.out.println("contains this substring");
        } else {
            System.out.println("no substring");
        }
    }

    public static void length(String string) {
        System.out.println("Length is: " + string.length());
    }

    public static void afterPrefix(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the prefix?");
        String prefix = scanner.nextLine();
        System.out.println("Substring: " + string.substring(string.indexOf(prefix) + prefix.length()));
    }

    public static void beforeSuffix(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the suffix?");
        String suffix = scanner.nextLine();
        System.out.println("Substring: " + string.substring(0, string.indexOf(suffix)));
    }

    public static void inbetweenPreAndSuf(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the prefix?");
        String prefix = scanner.nextLine();
        System.out.println("What is the suffix?");
        String suffix = scanner.nextLine();
        System.out.println("Substring: " + string.substring(string.indexOf(prefix) + prefix.length(), string.indexOf(suffix)));
    }
}
