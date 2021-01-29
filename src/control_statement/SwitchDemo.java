package control_statement;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Double num1, num2;
        char operator;
        Double output = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        num2 = scanner.nextDouble();

        System.out.println("Enter operator + - / *");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            default:
                System.out.println("Invalid operator");
        }

        System.out.println(num1 + " " + operator + " " + num2 + "= " + output);


    }
}
