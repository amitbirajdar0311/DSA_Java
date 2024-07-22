import java.util.*;
public class Diamond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            //first print spacess
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //then print stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n;i>=1;i--){
            //first print spacess
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //then print stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        

        sc.close();
    }
}
