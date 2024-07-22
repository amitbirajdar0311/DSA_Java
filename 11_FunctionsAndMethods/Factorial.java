import java.util.*;
public class Factorial {
    public static void factorial(int n){
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);
        sc.close();
    }
}
