package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {


        Set<Integer> set = new LinkedHashSet<>();
        set.add(92);
        set.add(33);
        set.add(111);
        set.add(22);

        System.out.println("Set=>"+set);

    }
}