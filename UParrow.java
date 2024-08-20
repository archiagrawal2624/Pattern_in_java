
import java.util.Scanner;

class UParrow {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the value for row (n): ");
        int n = s.nextInt();
        int x = (n / 2) + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // if (j == x || (i <= x && (j == x - i + 1 || j == x + i - 1))) {
                //     System.out.print("* ");
                // } 
                if (j==x || i +j ==x +1 || j==(n/2) +i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}