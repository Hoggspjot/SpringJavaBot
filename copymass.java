import java.util.Arrays;

public class copymass {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] x2 = Arrays.copyOf(x, 5);
        String str2 = Arrays.toString(x2);
        System.out.println(str2);
        int[] x3 = Arrays.copyOf(x,15);
        String str3 = Arrays.toString(x3);
        System.out.println(str3);
        int[] x4 = Arrays.copyOfRange(x3, 5, 10);
        String str4 = Arrays.toString(x4);
        System.out.println(str4);
    }
}
