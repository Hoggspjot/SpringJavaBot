package wowtest;

import java.util.HashMap;
import java.util.Map;

public class sub {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two",2);


        System.out.println(map.keySet());


        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " ==== "+ entry.getValue());
        }

    }
}
