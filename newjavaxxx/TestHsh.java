import java.util.HashMap;
import java.util.Map;

public class TestHsh {
    public static void main(String[] args) {
        Student std1 = new Student();
        String st1 = "Vasya";
        String st2 = "Roma";

        HashMap<String, Double> mapa = new HashMap<>();
        mapa.put(st1, 7.5);
        mapa.put(st2, 8.0);

        mapa.forEach((K,V) -> System.out.println(K+" "+V));


        for(Map.Entry<String, Double> entry : mapa.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }

    }
}



class Student{
    public static void print(){
        System.out.println("i am student");
    }
}
