import java.util.Scanner;

public class BottlesOfBeer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many bottles?");
        int numBottles = scanner.nextInt();
        for(int i = numBottles; i > 0; i--){
            if (i > 2) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.");
                System.out.println();
            }
            else if (i == 2) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (i - 1) + " bottle of beer on the wall.");
                System.out.println();
            }
            else {
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
                System.out.println("Take one down and pass it around, " + (0) + " bottles of beer on the wall.");
                System.out.println();
            }
        }
        System.out.println("0 bottles of beer on the wall, 0 bottles of beer.");
        System.out.println("Go to the store and buy some more, " + numBottles + " bottles of beer on the wall.");
    }
}
