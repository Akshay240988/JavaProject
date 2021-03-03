package test;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7: ");
        i= scanner.nextInt();

        switch (i){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number"
                );


        }
    }
}

// Object oriented principles: It consists of Inheritance, Polymorphism, Encapsulation and Abstraction

