package task2;

import java.util.ArrayList;
import java.util.List;

public class MergeArrayList {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List<Integer> list2=new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        list1.addAll(list2);
        System.out.println(list1);
        list1.set(1,12);
        System.out.println(list1);

        String s1="Today";
        String s2="Thursday";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));


    }
}
