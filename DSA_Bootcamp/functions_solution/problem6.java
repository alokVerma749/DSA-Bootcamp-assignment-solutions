package DSA_Bootcamp.functions_solution;

import java.util.Scanner;

public class problem6 {
    //    Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = sc.nextDouble();
        fun(radius);
    }

    private static void fun(double radius) {
        System.out.println("Circumference is " + (2 * 3.1 * radius));
        System.out.println("Area is " + (3.14 * radius * radius));
    }
}
