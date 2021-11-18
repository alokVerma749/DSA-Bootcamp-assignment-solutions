package DSA_Bootcamp.first_java_solution;

import java.util.Scanner;

public class problem2 {
    //    Take name as input and print a greeting message for that name.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Hello! " + name + " how are you.");
    }
}
