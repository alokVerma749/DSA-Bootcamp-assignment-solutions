package DSA_Bootcamp.importantAlgorithm;

public class SieveOfEratosthenes {
    //    find all the prime numbers less than 40.

    public static void main(String[] args) {
        int n = 99;
        sieve(n);
    }

    private static void sieve(int n) {
//        creates a boolean array in order to represent each boolean array element to the numbers from 0 to n.
        boolean[] primes = new boolean[n + 1];

//        Assumes that every number is prime.
        for (int p = 0; p < primes.length; p++) {
            primes[p] = true;
        }


        for (int i = 2; i * i <= n; i++) {
            if (primes[i] == true) {
                for (int j = i * i; j < primes.length; j = j + i) {
                    primes[j] = false;
                }
            }
        }
        for (int i = 2; i < primes.length; i++) {
            if (primes[i] == true) {
                System.out.println(i);
            }
        }
    }
}
