
import java.util.Scanner;

public class pascal {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number (n) ");
        int n=s.nextInt();
        pascalprint(n);
    }
    private static void pascalprint(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            int number=1;
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
                number=number*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
