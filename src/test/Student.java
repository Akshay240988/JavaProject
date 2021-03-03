package test;

public class Student {
    int rollNo;
    String name;
    long contactNo;
    int totalMarks;

    public Student(int rollNo,String name,long contactNo,int totalMarks) {
        this.rollNo = rollNo;
        this.name = name;
        this.contactNo = contactNo;
        this.totalMarks = totalMarks;
    }
    public void display(){
        System.out.println("Roll No.:"+rollNo+" Name :"+name+" Contact No:"+contactNo+" Total marks :"+totalMarks);
    }
}

class StudentDemo{
    public static void main(String[] args) {
        Student s = new Student(1,"Sachin",993048573,90);
        s.display();

    }

}