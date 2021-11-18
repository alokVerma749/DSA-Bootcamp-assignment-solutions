package DSA_Bootcamp.functions_solution;

public class problem13 {
    //    Write a function that returns all prime numbers between two given numbers.
    public static void main(String[] args) {
        int a = -10;
        int b = 50;
        primes(a, b);
    }

    //    if number is prime the print it.
    private static void primes(int a, int b) {
        for (int i = a; i < b; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }

    //    check if the number is prime or not.
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        else {
            for (int i = 2; i < num; i++) {
                if ((num % i) == 0) return false;
            }
            return true;
        }
    }
}
