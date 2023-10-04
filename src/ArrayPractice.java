import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        String[] first = {"hello", "fuck off", "goodbye", "go to hell", ":3"};
        String[] second = {"hello", "goodbye", ":3"};
        System.out.println(Arrays.toString(FindCommon(first, second)));
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
}
