package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    int id;
    String name;
    String addr;

    public ComparatorDemo(int id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }
}


class ComparatorMain{
        public static void main(String[] args) {
            ComparatorDemo e1 = new ComparatorDemo(3,"Sachin","Pune");
           ComparatorDemo e2 = new ComparatorDemo(2,"Akshay","Thane");
            ComparatorDemo e3 = new ComparatorDemo(1,"Rohit", "Latur");

            List<ComparatorDemo> employees = new ArrayList<>();
            employees.add(e1);
            employees.add(e2);
            employees.add(e3);

            Comparator<ComparatorDemo> comparator = new Comparator<ComparatorDemo>() {
                @Override
                public int compare(ComparatorDemo o1, ComparatorDemo o2) {
                    if (o1.id > o2.id) {
                        return 1;
                    } else {
                        return -1;
                    }

                }
            };

            Collections.sort(employees,comparator);

            employees.forEach(s->{
                System.out.println(s.id+" "+s.name+" "+s.addr);
            });



        }
    }


