package DSA_Bootcamp.first_java_solution;

import java.util.Scanner;

public class problem8 {
    //    To find out whether the given String is Palindrome or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = sc.next();
        for (int i = 0; i < ((word.length() - 1) / 2); i++) {
            if (word.charAt(word.length() - (i + 1)) != word.charAt(i)) {
                System.out.println("not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
// a i b o h p h o b i a // a b c b a