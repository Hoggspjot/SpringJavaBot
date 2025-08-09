
import static javax.swing.JOptionPane.*;



public class Test {
    public static void main(String[] args) {
        String txt, str;
        txt=showInputDialog("Ввдите текст ");
        int size=txt.length();
        char A=txt.charAt(0);
        char B=txt.charAt(size-1);
        str="Текст"+txt+"\n";
        str+="Сиволов в тексте "+size+"\n";
        str+="Первый символ - "+A+"\n";
        str+="Последний символ - "+B+"\n";
        showMessageDialog(null,str);
    }
}
