import java.util.Scanner;

public class plaindromepyramid {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number (n) ");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
