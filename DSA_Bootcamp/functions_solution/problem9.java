package DSA_Bootcamp.functions_solution;

import java.util.Scanner;

public class problem9 {
    //    Write a program to print the factorial of a number by defining a method named 'Factorial'.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        factorial(num);
    }

    private static void factorial(int num) {
        int ans = 1;
        for (int i = 2; i <= num; i++) {
            ans = ans * i;
        }
        System.out.println("Factorial of " + num + " is " + ans);//factorial of any number below 2 is 1(according to this function).
    }
}
