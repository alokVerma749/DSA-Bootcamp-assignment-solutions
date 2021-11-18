package DSA_Bootcamp.functions_solution;

import java.util.Scanner;

public class problem10 {
    //    Write a function to find if a number is a palindrome or not. Take number as parameter.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        fun(num);
        Integer num1 = 12320;
        fun2(num1);
    }

    private static void fun(int num) {
        int temp = num;
        int rev = 0;
        int multiple = 100;//Only works for three-digit numbers.
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            rev += digit * multiple;
            multiple /= 10;
        }
        System.out.println(rev + " " + (rev == temp));
    }

    private static void fun2(Integer num) {
        int length = num.toString().length();
        for (int i = 0; i < (length / 2); i++) {
            if ((num.toString().charAt(i)) != (num.toString().charAt(length - (i+1)))) {
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("palindrome");
    }
//Here are two functions available use according to your needs.
}
