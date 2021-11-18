package DSA_Bootcamp.first_java_solution;

import java.util.Scanner;

public class problem7 {
    //    To calculate Fibonacci Series up to n numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();
        int pdigit = 0;
        int cdigit = 1;
        System.out.println(pdigit);
        System.out.println(cdigit);
        for (int i = 0; i < n; i++) {
            System.out.println(cdigit);
        }
    }
}
// 0 1 1 2 3 4 5 9 14 ..........