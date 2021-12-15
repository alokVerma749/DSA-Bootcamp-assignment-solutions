package DSA_Bootcamp.importantAlgorithm;

public class NewtonRaphson {
    //    find the square root of 589.
    /**
     * To find the square root of a constant,firstly convert the constant into a polynomial.
     * eg: if x = 55,and we have to find the root of x.Then the polynomial will be x^2 - 55 =0.
     */
    public static void main(String[] args) {
        double n = 589;
        double Xo = 24;
        newton(Xo, n);
    }
    /**
     * Xn+1 = Xn - f(x)/f'(x)
     */
    private static void newton(double x, double n) {
        final double EPSILON = 0.01;
        double h = fun(x, n) / dfun(x);
        if (h <= EPSILON) {
            h = fun(x, n) / dfun(x);
            x = x - h;
        }
        System.out.println("root is " + x);
    }

    private static double dfun(double x) {
        return (2 * x);
    }

    private static double fun(double x, double n) {
        return ((x * x) - n);
    }
}
