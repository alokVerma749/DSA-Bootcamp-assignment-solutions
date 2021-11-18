package DSA_Bootcamp.flow_of_program_solution;

import java.util.Scanner;

public class problem3 {
    //    Take a number as input and print the multiplication table for it.
    public static void main(String[] args) {
        System.out.println("Input a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
