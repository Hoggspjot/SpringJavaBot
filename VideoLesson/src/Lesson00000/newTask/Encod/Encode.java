package Encod;

class Encode {
    public static void main(String args[]) {
        String msg = "This is а test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Иcxoднoe сообщение: ");
        System.out.println(msg);

        // Зашифровать сообщение
        for (int i = 0; i < msg.length(); i++)

// Построение зашифрованной строки сообщения
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        //Соэдание эаwифрованной строки

        System.out.print("Зamифpoвaннoe сообщение: ");
        System.out.println(encmsg);

// Дешифровать сообщение
        for (int i = 0; i < msg.length(); i++) {
            // Построение дешифрованной строки сообщения

            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

            // Саэданне деwифрованной строки

            System.out.print("Дeшифpoвaннoe сообщение: ");
            System.out.println(decmsg);
        }
    }

}