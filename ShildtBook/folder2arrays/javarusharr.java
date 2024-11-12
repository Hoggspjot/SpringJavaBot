
import java.util.ArrayList;

class javarusharr {
    public static void main(String[] args) {
        int e = 1, i = 2, b = 3;

        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(e);
        array.add(i);
        array.add(1, b);
        System.out.println(array);
        System.out.println(array.size());
        array.clear();
        System.out.println(array);
        System.out.println(array.isEmpty());
    }
}