package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    int id;
    String name;
    String addr;
    int salary;

    public StreamDemo(int id, String name, String addr, int salary) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StreamDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        StreamDemo streamDemo = new StreamDemo(1,"abc","Pune",9876);
        StreamDemo streamDemo1 = new StreamDemo(2,"abcd","Pune1",12984);
        StreamDemo streamDemo2 = new StreamDemo(3,"abcde","Pune2",2234);

        List<StreamDemo> list = new ArrayList<>();
        list.add(streamDemo);
        list.add(streamDemo1);
        list.add(streamDemo2);

        List<Integer> list1= list.stream()
                .map(m->m.salary*2)
                .collect(Collectors.toList());
        System.out.println(list1);

        list.stream()
                .filter(f->f.salary>9000)
                .map(StreamDemo::getName)//if you just want to display names then use method reference and getter.
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
