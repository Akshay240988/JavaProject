package collection;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {
    public static void main(String[] args) {

        int arr[] = new int[6];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        //enhanced for loop

        for (int i : list) {
            System.out.println(i);
        }


        System.out.println();


        //traditional for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }



            System.out.println();


            //lambda expression

           list.forEach((s) -> {

             System.out.println(s);
           });
    }


}

