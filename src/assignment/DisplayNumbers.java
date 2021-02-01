package assignment;

import java.util.Scanner;

public class DisplayNumbers {
    public static void main(String[] args) {
        int num, fact = 1;

        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Enter a number:");
        num=scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num*i);
        }*/

        for (int j = 1; j <= 100; j++) {
            System.out.println(j);
        }

        System.out.println("Enter a number:");
        num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is " + fact);


       /* for (int i = 1; i <= 4; i++) {
            for (int space = 1; space <= 4 - i;space++) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }*/
        for(int i=0;i<4;i++){
            for(int j=4-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }


    }


}


