import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i == 0) {
            int size = giveSize();
            System.out.println("enter fill");
            String fill = String.valueOf(scanner.next().charAt(0));
            printTriangle(size, fill);
            System.out.println("would you like another triangle? (Y/N)");
            String yesOrNo = scanner.next();
            if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {

            } else if (yesOrNo.equals("N") || yesOrNo.equals("n")) {
                i = 1;
            } else {
                System.out.println("Invalid input, defaulting to 'no'");
                i = 1;
            }
        }
    }

    public static void printTriangle(int size, String fill) {
        for (int i = 1; i < size + 1; i++) {
            int numSpaces = size - i;
            for (int j = numSpaces; j > 0; j--){
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--){
                System.out.print(fill);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int giveSize() {
        for (int i = 0; i == 0; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter size");
            int size = scanner.nextInt();
            if (size < 1 || size > 50) {
                System.out.println("Size must be between 1-50!");
            } else {
                return size;
            }
        }
        return 0;
    }
}


