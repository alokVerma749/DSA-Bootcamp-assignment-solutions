package DSA_Bootcamp.first_java_solution;

import java.util.Scanner;

public class problem6 {
    //    Input currency in rupees and output in USD.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter indian currency ");
        double indian = sc.nextDouble();
        System.out.println(indian + " in USD is " + (indian/74.43));
    }
}
