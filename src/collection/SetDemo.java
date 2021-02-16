package collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(33);
        set.add(99);
        set.add(22);

        System.out.println("Set=>"+set);

    }
}