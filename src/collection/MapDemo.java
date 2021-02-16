package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"String1");
        map.put(2,"String2");
        map.put(3,"String3");
        map.put(4,"String4");

        map.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

    }
}
