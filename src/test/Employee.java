package test;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    int empId;
    String empName;
    String empAdd;
    double salary;

    public Employee(int empId,String empName,String empAdd,double salary) {
        this.empId = empId;
        this.empName = empName;
        this.empAdd = empAdd;
        this.salary = salary;

    }



    public static void main(String[] args) {
           Employee e1 = new Employee(1,"Rahul","Pune",50.5);
           Employee e2 = new Employee(2,"Sachin","Mumbai",100.20);

           List<Employee> list = new ArrayList<>() ;
           list.add(e1);
           list.add(e2);

           list.forEach(s->{
               System.out.println(s.empId+" "+s.empName+" "+s.empAdd+" "+s.salary);
           });

    }
}
