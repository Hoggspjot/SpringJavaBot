
import java.util.Scanner;

public class SwitchOp {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введи возраст ");
            int age = sc.nextInt();
            switch (age) {
                case 0 -> System.out.println("родился");
                case 7 -> System.out.println("Школа");
                case 18 -> System.out.println("Закончил школу");
                default -> System.out.println("непонятно");
            }
        }
    }
}
