import java.util.*;

public class PrimeOrNot {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check it is prime or not: ");
    int a = sc.nextInt();
    boolean flag = false;
    if (a == 1 || a == 0) {
      System.out.println("It is not a prime number");
    } else {
      for (int i = 2; i < a; i++) {
        if (a % i == 0) {
          flag = true;
          break;
        }
      }

      if (flag == false) {
        System.out.println("given numbre is prime");
      } else {
        System.out.println("given number is not a prime number");
      }
    }
  }
}
