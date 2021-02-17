package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee>{
   int id;
   String name;
   String addr;

    public Employee(int id,String name,String addr) {
        this.id = id;
        this.name=name;
        this.addr=addr;
    }

    @Override
    public int compareTo(Employee o) {
        return this.addr.compareTo(o.addr);
    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.name.compareTo(o.name);
//    }

//    @Override
//    public int compareTo(Employee employees) {
//        if(this.id==employees.id)
//        return 0;
//        else if(this.id>employees.id)
//            return 1;
//        else
//            return -1;
//    }
}

class Main{
    public static void main(String[] args) {
        Employee e1 = new Employee(3,"Sachin","Pune");
        Employee e2 = new Employee(2,"Akshay","Thane");
        Employee e3 = new Employee(1,"Rohit", "Latur");

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

       Collections.sort(employees);

        employees.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.addr);
        });



    }
}
