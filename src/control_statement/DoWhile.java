package control_statement;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        int num, guess, trial=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number:");

        num = (int) (Math.random() * 100);

        System.out.println(num);

        do {
            System.out.println("Enter the number:");
            guess = scanner.nextInt();
            trial++;
            if (guess < num) {
                System.out.println("Too low");
            } else if (guess > num) {
                System.out.println("Too high");
            } else {
                System.out.println("Guess is correct after trial " + trial);
            }
        } while (guess != num);
    }
}