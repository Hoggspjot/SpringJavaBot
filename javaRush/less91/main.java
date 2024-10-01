
import java.lang.classfile.instruction.ReturnInstruction;
import java.util.regex.Matcher;

public class main {

    public static int getRandom() {
        return (int) (Math.random() * 6) + 1;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
                int x = getRandom();
                System.out.println(x);
        }
    }
}