import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class pract {
    public static void main(String[] args) {
        Map<Integer, String > persons = new HashMap<>();
        persons.put(112344, "Василий");
        persons.put(112312, "Виктор");
        persons.put(112324, "Вика");
        persons.put(123423, "Игорь");
        persons.put(232342, "Света");
        persons.put(112341, "Борис");
        persons.put(111232, "Никита");


        Map<Integer, String> lol = new HashMap<>();
        lol.put(123, "qq");
        lol.put(321, "ww");

        System.out.println(persons.keySet());
        System.out.println(persons.values());
        System.out.println(persons.replace(111232, "Бобер" ));
        System.out.println(persons.values());
        persons.remove(111232);


        for(Map.Entry<Integer,String>  item: persons.entrySet() ){
            System.out.println(item.getKey()+" "+ item.getValue());
        }

        persons.putAll(lol);

        for (Map.Entry<Integer, String> item: persons.entrySet()){
            System.out.println(item.getKey() +" "+ item.getValue());
        }



    }
}
