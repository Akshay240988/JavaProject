package task3;

import java.util.Scanner;

public class YearsWeeksDays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i= scanner.nextInt();

        int y =i/365;
        System.out.println("Number of years: "+y);
        int w = (i%365)/7;
        System.out.println("Number of weeks: "+w);
        int d = (i%365)%7;
        System.out.println("Number of days: "+d);

    }
}
