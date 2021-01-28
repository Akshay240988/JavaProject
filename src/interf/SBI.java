package interf;

public class SBI implements Bankrule{
    @Override
    public void interest() {
        System.out.println("interest is 10%");
    }

    @Override
    public void rule() {
        System.out.println("minimum Rs.100 is required");
    }

    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.interest();
        sbi.rule();
    }
}
interface Bankinterface{

    public void interest();
}

 interface Bankrule extends Bankinterface{
    public void rule();
}