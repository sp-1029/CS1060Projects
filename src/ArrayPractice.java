import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = {0, 2, 2, 3, 5, 1, 4, 4};
        FindEvenOdd(array);
    }
    public static String[] FindCommon(String[] first, String[] second) {
        String[] third = new String[first.length + second.length];
        int n = 0;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if(first[i].equals(second[j])) {
                    third[n] = first[i];
                    n++;
                }
            }
        }
        return Arrays.copyOf(third, n);
    }
    public static void FindEvenOdd(int[] array) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
    }

    public static int ArrayAverage(int[] array) {
        int[] newArray = new int[array.length];
        int smallest = array[0];
        int largest = array[0];
        for(int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
            if (largest < array[i]) {
                largest = array[i];
            }
        }

    }
}
