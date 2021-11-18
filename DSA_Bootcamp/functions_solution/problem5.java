package DSA_Bootcamp.functions_solution;

import java.util.Scanner;

public class problem5 {
    //    Define a method that returns the product of two numbers entered by user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        product(a, b);
    }

    private static void product(int a, int b) {

        System.out.println("Sum is " + (a * b));
    }
}
