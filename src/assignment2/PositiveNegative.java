package assignment2;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        int i,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        i=scanner.nextInt();

        if(i>0){
            System.out.println(i+" is positive");
        }else if(i<0){
                System.out.println(i+" is negative");
            }else{
                System.out.println("number is zero");
            }
        }
    }

