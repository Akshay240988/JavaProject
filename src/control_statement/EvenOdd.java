package control_statement;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=scanner.nextInt();

        for(int i=1;i<=num;i++) {
            if (i % 2 == 0) {
                System.out.println("Even number " + i);
            } else {
                System.out.println("Odd number "+ i);
            }

        }
    }
}
