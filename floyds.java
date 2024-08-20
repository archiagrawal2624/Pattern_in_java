import java.util.Scanner;

public class floyds {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number (n) ");
        int n=s.nextInt();
        int counting=1;
        for( int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(counting+ " ");
                counting++;
            }
            System.out.println();
        }
    }
}
