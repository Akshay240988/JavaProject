package thiskeyword;

public class Employee {

    //instance variable
    int id;
    String name;
    String address;

    public Employee(int id,String name,String address){//local variable
        this.id=id;
        this.name=name;
        this.address=address;
    }

    private void display(){
        System.out.println("In Display");
    }

    public void show(){
        this.display();
        System.out.println("ID "+id+" name "+name+" address "+address);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, "Sachin", "Pune");
        emp.show();
    }
}

