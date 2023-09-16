import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = giveSize();
        System.out.println("enter fill");
        String fill = String.valueOf(scanner.next().charAt(0));
        for(int i = 0; i == 0;){
            printTriangle(size, fill);
            System.out.println("would you like another triangle? (Y/N)");
            String yesOrNo = scanner.next();
            if (yesOrNo.equals() "yes"){

            }
        }
    }

    public static void printTriangle(int size, String fill) {

    }
    public static int giveSize(){
        for(int i = 0; i == 0;){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter size");
            int size = scanner.nextInt();
            if (size < 1 || size > 50){
                System.out.println("Size must be between 1-50!");
            } else {
                return size;
            }
        }
        return 0;
    }
}

