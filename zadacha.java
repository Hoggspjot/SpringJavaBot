import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class zadacha {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min1 = 0, min2 = 0;
    int x = sc.nextInt();
    int y = sc.nextInt();
    if (x < y) {
        min1 = x;
        min2 = y;  
    } 
    else {
        min1 = y;
        min2 = x;
    }
    while (sc.hasNextInt()) {
    int a = sc.nextInt();
    if (min1 > a) {
        min2 = min1;
        min1 = a;
    }
    if ( min2 > a && a > min1)
        min2 = a;
    if (min1 == min2 && a > min1)
        min2 = a;
    }
    System.out.println(min1);
    System.out.println(min2);
}
}