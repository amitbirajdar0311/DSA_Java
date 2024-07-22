import java.util.*;
public class InvertedAndRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            //first print all spacess 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //then print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
