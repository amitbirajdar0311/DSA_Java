import java.util.*;
public class ButterFly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //first half
        for(int i=1;i<=n;i++){
            //first * 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //second spaces = 2n-2i
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //thrid * 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //second half
         for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");


        }

        sc.close();
    }
}
