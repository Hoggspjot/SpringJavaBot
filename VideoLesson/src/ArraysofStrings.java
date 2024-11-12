

public class ArraysofStrings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "bye";
        strings[2] = "hi";

        for (int i = 0; i < strings.length; i++) {
                System.out.println(strings[i]);
        }

        for (String stirng:strings){
            System.out.println(stirng);
        }
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for (int i : numbers1) {
            sum+=i;            
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;
        String s = null;
        System.out.println(s);
    }
}
