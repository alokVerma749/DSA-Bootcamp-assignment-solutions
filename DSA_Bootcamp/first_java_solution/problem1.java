package DSA_Bootcamp.first_java_solution;

import java.util.Scanner;

public class problem1 {
//    Write a program to print whether a number is even or odd, also take input.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if ((num % 2) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
