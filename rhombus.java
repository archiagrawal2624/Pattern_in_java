
import java.util.Scanner;

public class rhombus {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the number (n) ");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    
    }

}
