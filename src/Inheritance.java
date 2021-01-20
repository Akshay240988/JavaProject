public class Inheritance {

    public static void main(String[] args) {
        showAddition sa = new showAddition();
        showSubstraction ss = new showSubstraction();
        showMultiplication sm = new showMultiplication();
        showDivision sd = new showDivision();
        sa.add();
        sa.showAdd();

        ss.substract();
        ss.showSubstract();
        sm.multiply();
        sm.showMultiply();
        sd.divide();
        sd.showDivide();


    }

}

class Calculate {
    int a=9, b=7, c;

    public void add() {
        c = a + b;
    }

    public void substract() {
        c = a - b;
    }

    public void multiply() {
        c = a * b;
    }

    public void divide() {
        c = a / b;
    }

}

class showAddition extends Calculate {

    public void showAdd() {
        System.out.println("Addition of two numbers is " + c);
    }

}

class showSubstraction extends Calculate {

    public void showSubstract() {
        System.out.println("Substraction of two numbers is" + c);
    }
}

class showMultiplication extends Calculate {
    public void showMultiply() {
        System.out.println("Multiplication of two numbers is" + c);
    }
}

class showDivision extends Calculate {
    public void showDivide() {
        System.out.println("Division of two numbers is" + c);
    }
}