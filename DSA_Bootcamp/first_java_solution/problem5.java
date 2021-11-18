package DSA_Bootcamp.first_java_solution;

import java.util.Scanner;

public class problem5 {
    //    Take 2 numbers as input and print the largest number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater ");
        } else {
            System.out.println(num2 + " is greater");
        }
    }
}
