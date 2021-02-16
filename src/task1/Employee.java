package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
   int id;
   String name;
   String addr;

    public Employee(int id,String name,String addr) {
        this.id = id;
        this.name=name;
        this.addr=addr;
    }
}

class Main{
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Sachin","Pune");
        Employee e2 = new Employee(2,"Akshay","Thane");
        Employee e3 = new Employee(3,"Rohit", "Latur");

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

      //  Collections.sort(List<Employee> employees,Comparator<? super employees>c );

        employees.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.addr);
        });



    }
}
