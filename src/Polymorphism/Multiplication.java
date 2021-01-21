package Polymorphism;

public class Multiplication {

    public void multiply(int a, int b){
        System.out.println(a*b);
    }

    public void multiply(float a,float b){
        System.out.println(a*b);
    }

    public void multiply(int a,float b){
        System.out.println(a*b);
    }


    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        m.multiply(5,6);
        m.multiply(2.5f,2.0f);
        m.multiply(6,4.1f);

    }
}
