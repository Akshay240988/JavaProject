package assignment2;

import java.util.Scanner;

public class Total_Average {
    public static void main(String[] args) {
        int marks,total=0,average;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter marks of 6 subjects: ");
        for(int i=0;i<6;i++){
            marks=scanner.nextInt();
            total=total+marks;
        }

        average=total/6;

        System.out.println("Total of 6 subjects = "+total);
        System.out.println("Average of 6 subjects = "+average);



        }

     }

