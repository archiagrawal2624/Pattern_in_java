import java.util.Scanner;

public class SimpleSandTimer {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the height of the sand timer: ");
            int n = s.nextInt(); // User-defined height of the sand timer

            // Upper part of the sand timer
            for (int i = 0; i < n; i++) {
                printLine(i, n);
            }

            // Lower part of the sand timer
            for (int i = n - 2; i >= 0; i--) {
                printLine(i, n);
            }

            s.close();
        }
    }

    private static void printLine(int i, int n) {
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < 2 * (n - i) - 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
