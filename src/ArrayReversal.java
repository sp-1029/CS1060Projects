import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        int addToArray;
        int length = 0;
        System.out.println("Type positive integers and I will put them in an array, don't go over 100, I will end once you type in '-1' and print the array backwards");
        for(int i = 0; i <= 99; i++) {
            System.out.println("next number:");
            addToArray = scanner.nextInt();
            if(addToArray == -1){
                break;
            } else if (addToArray < 0) {
                System.out.println("Invalid number");
                i--;
            } else {
                array[i] = addToArray;
                length++;
            }
        }
        for(int i = length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
