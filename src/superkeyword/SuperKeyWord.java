package superkeyword;

public class SuperKeyWord {

    public static void main(String[] args) {
        B b = new B(2);
    }
}


class A extends Object{
    public A(int i){
        System.out.println("In class A constructor");
    }

    public A(){
        System.out.println("In class A const.");
    }
}

class B extends A{
    public B(int i){
        super(i);
        System.out.println("In class B constructor");
    }

}

