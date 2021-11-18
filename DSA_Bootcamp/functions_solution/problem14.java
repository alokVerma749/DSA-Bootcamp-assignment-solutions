package DSA_Bootcamp.functions_solution;

public class problem14 {
    //    Write a function that returns the sum of first n natural numbers.
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
