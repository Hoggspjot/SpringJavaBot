public class Arrays {
    public static void main(String[] args) {
    int[] numbers = new int[5]; 
    int[] num2 = {1,2,3};  //ссылочный тип данных
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = i*10;
    }
    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }
    for (int i = 0; i < num2.length; i++) {
        System.out.println(num2[i]);
    }
    }
}
