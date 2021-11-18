package DSA_Bootcamp.first_java_solution;

import java.util.Scanner;

public class problem4 {
    //    Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number ");
        int num2 = sc.nextInt();

        System.out.println("Enter an operator(+,-,*,/) ");
        char operator = sc.next().charAt(0);//to take a character as input.
        if (operator == '+') {
            System.out.println("Sum is " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Difference is " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Product  is " + (num1 * num2));
        } else if (operator == '/') {
            System.out.println("Quotient is " + (num1 / num2));
        } else {
            System.out.println("Invalid input");
        }
    }
}
