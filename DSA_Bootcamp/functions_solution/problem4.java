package DSA_Bootcamp.functions_solution;

import java.util.Scanner;

public class problem4 {
    //    Write a program to print the sum of two numbers entered by user by defining your own method.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a, b);
    }

    private static void sum(int a, int b) {
        System.out.println("Sum is " + (a + b));
    }
}
