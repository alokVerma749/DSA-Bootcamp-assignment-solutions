package DSA_Bootcamp.functions_solution;

public class problem12 {
    //    Write a function to check if a given triplet is a Pythagorean triplet or not.
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        pythagoean(a, b, c);
    }

    private static void pythagoean(int a, int b, int c) {
        if ((((a * a) + (b * b)) == (c * c)) || ((((b * b) + (c * c))) == (a * a)) || (((c * c) + (b * b)) == (a * a))) {
            System.out.println("pythagorean triplet");
        } else System.out.println("not a pythagorean triplet");
    }
}
