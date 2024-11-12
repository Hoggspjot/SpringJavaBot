
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введи что нибудь ");
            int x = sc.nextInt();
            System.out.println("Вы ввели "+x );
        }
      
    }
}

