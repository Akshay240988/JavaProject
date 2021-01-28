package control_statement;

public class IfElseDemo {
    public static void main(String[] args) {
        int a,b,c,d,i,age;
        String nationality;
        nationality = "Pak";
        a=2343;
        b=5664;
        c=9883;
        d=33345;

        i=20;

        age=22;
// if-else ladder
        if(a>b && a>c && a>d){
            System.out.println("a is greatest");
        }else if(b>c && b>d){
            System.out.println("b is greatest");
        }else if(c>d){
            System.out.println("c is greatest");
        }else{
            System.out.println("d is greatest");
        }
// single if-else
        if(i>0){
            System.out.println("i is positive");
        }else{
            System.out.println("i is negative");
        }

// ternary operator
        String s = i>0?"i is positive":"i is negative";


        //nested if-else

        if(age>18){
            if (nationality=="Indian"){
                System.out.println("You can vote");
            }else{
                System.out.println("Not Indian");
            }
        }else{
            System.out.println("You cannot vote");
        }

    }

}
