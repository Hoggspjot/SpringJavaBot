package Help123;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class strSort {
    public static void main(String[] args) throws IOException {
        try  {
            StringBuilder str = new StringBuilder();
          BufferedReader buf = new BufferedReader(new FileReader("C:\\JavaProject\\javaDesktop\\VideoLesson\\src\\Lesson00000\\newTask\\Help123\\text.txt"));
        String line;
        while ((line = buf.readLine())!= null){
            str = new StringBuilder(str + line);
        }
     String[] array = str.toString().split(" ");

        print(array);
        sort(array);
        print(array);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static void print(String[] arr){
        for (String x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    static void sort(String[] arr){
        String temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > 0 ; j--) {
                    if(arr[j].compareTo(arr[j-1]) < 0){
                            temp = arr[j-1];
                            arr[j-1] = arr[j];
                            arr[j] = temp;
                    }
            }
        }
    }
}
