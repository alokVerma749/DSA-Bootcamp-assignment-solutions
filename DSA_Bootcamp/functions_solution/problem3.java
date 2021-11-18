package DSA_Bootcamp.functions_solution;

import java.util.Scanner;

public class problem3 {
    /* A person is eligible to vote if his/her age is greater than or equal to 18.
    Define a method to find out if he/she is eligible to vote. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        double age = sc.nextDouble();
        System.out.println("you are eligible to vote: "+isEligible(age));;
    }
    private static boolean isEligible(double age){
        return age >= 18;
    }
}
