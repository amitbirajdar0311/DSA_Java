import java.util.*;

public class GreateOfThreeNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number as a : ");
    int a = sc.nextInt();
    System.out.println("Enter second number as b: ");
    int b = sc.nextInt();
    System.out.println("Enter third number as c: ");
    int c = sc.nextInt();
    if (a >= b && a >= c) {
      System.out.println("largest is a : " + a);
    } else if (b >= c) {
      System.out.println("largest is b  : " + b);
    } else {
      System.out.println("largest is c : " + c);
    }
    sc.close();
  }
}
