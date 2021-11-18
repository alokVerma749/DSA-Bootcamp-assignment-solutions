package DSA_Bootcamp.flow_of_program_solution;

import java.util.Scanner;

public class problem1 {
//    Input a year and find whether it is a leap year or not.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a year");
        int year = sc.nextInt();
        if ((year % 4) == 0) {
            System.out.println("leap year");
        } else if ((year % 400) == 0) {
            if ((year % 100) != 0) {
                System.out.println("leap year");
            }
        } else System.out.println("not a leap year");
    }
}
//if a year is fully divisible by 4 then it is a leap year.
//or,if it is divisible by 400 and not divisible by 100,then it is leap year.
