package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMaps {
    public static void main(String[] args) {
        List<Map<Integer,String>> list = new ArrayList<>();
        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>();

        map1.put(1,"String 1");
        map1.put(2,"String 2");
        map1.put(3,"String 3");
        map1.put(4,"String 4");

        map2.put(5,"String 5");
        map2.put(6,"String 6");
        map2.put(7,"String 7");
        map2.put(8,"String 8");


        list.add(map1);
        list.add(map2);

        list.forEach(s->{
            s.forEach((k,v)->{
                System.out.println(k+" "+v);
            });
        });
    }
}
