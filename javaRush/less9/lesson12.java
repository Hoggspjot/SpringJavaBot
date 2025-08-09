import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class lesson12 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<String> files = Files.readAllLines(Path.of(sc.nextLine()));

        for (int i = 0; i < files.size(); i++) {
            if(i % 2 == 0)
                System.out.println(files.get(i));

        }
    }
}
