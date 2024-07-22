import java.util.*;

public class PrimeNumberInARange {

  public static boolean isPrime(int n) {
    if(n==1){
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void printPrimeNumberInARAnge(int a, int b) {
    for (int i = a; i <= b; i++) {
      if(isPrime(i)==true){
        System.out.print(i+" ");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    printPrimeNumberInARAnge(a, b);

    sc.close();
  }
}
