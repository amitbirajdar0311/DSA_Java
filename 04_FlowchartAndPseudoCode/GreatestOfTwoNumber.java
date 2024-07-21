import java.util.*;

public class GreatestOfTwoNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number as : a = ");
    int a = sc.nextInt();
    System.out.println("Enter second number as : b =");
    int b = sc.nextInt();
    int max = a > b ? a : b;
    System.out.println("greatest number is = " + max);
    sc.close();
  }
}
