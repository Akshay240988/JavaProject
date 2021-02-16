package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDeclarationTypes{
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);


        List<Integer> list1 = new ArrayList<>(Arrays.asList(11,22,33,44));
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>(List.of(111,222,333,444));
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>(){{
           add(1111);
           add(2222);
           add(3333);
           add(4444);
        }};

        System.out.println(list3);
    }
}
