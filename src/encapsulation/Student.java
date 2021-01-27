package encapsulation;

public class Student {

    private int id;
    private String name;

    public static void main(String[] args) {
        Student stu = new Student();
        stu.setId(6);
        stu.setName("Sachin");
        System.out.println(stu.getId());
        System.out.println(stu.getName());
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}

class College {

    public static void main(String[] args) {
        Student stu = new Student();

    }
}
