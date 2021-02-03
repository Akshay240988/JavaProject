package assignment2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        boolean leap;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        year=scanner.nextInt();
        if(year%4==0){
            if(year%100==0){    // century year
                if(year%400==0){
                    leap = true;
                }else
                    leap=false;
            }else
                leap=true;//not a century year
        }else
            leap=false;

        if(leap){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
    }
}
