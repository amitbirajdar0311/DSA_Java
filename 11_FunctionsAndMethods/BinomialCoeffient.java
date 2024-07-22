import java.util.*;
public class BinomialCoeffient {

    public static int factorial(int n){
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }
    public static void binomialCoefficient(int n, int r){
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nMinusRFact = factorial(n-r);

        System.out.println(nFact/(rFact*nMinusRFact));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter r");
        int r = sc.nextInt();
        binomialCoefficient(n, r);
        sc.close();
    }
}
