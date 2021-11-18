package DSA_Bootcamp.functions_solution;

import java.util.Scanner;

public class problem2 {
    //    Define a program to find out whether a given number is even or odd.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers");
        int a = sc.nextInt();
        System.out.println(a + " is even: " + isEven(a));
    }

   private static boolean isEven(int a) {
        return (a % 2) == 0;
    }
}
