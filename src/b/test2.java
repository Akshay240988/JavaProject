package b;

import a.test1;

public class test2 extends test1 {
    public void msg2(){
        System.out.println("In test2 class in package b");

    }

    public static void main(String[] args) {
        test2 test2=new test2();
        test2.msg1();
        test2.msg2();


    }
}
