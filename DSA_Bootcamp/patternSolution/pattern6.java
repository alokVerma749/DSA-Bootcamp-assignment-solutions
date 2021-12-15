package DSA_Bootcamp.patternSolution;

public class pattern6 {
//            *
//           **
//          ***
//         ****
//        *****
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (col >= 5 - (row-1)) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
