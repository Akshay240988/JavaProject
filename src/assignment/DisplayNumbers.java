package assignment;

import java.util.Scanner;

public class DisplayNumbers {
    public static void main(String[] args) {
        int num, fact = 1;

        Scanner scanner = new Scanner(System.in);

        for (int j = 1; j <= 100; j++) {
            System.out.println(j);
        }

        System.out.println("Enter a number:");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is " + fact);

    }


}


