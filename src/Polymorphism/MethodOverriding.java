package Polymorphism;

public class MethodOverriding {

    public static void main(String[] args) {

        SBI sbi = new SBI();
        sbi.interest(9);
        ICICI icici = new ICICI();
        icici.interest();
        BOI boi = new BOI();
        boi.interest();

    }
}

class Bank{
    public void interest(int i){
        System.out.println("Default interest is 10%");
    }
}

class SBI extends Bank {
    public void interest(){
        System.out.println("Interest is 20%");
    }
}

class ICICI extends Bank {
    public void interest(){
        System.out.println("Interest is 30%");
    }
}

class BOI extends Bank {
    public void interest(){
        System.out.println("Interest is 40%");
    }
}
