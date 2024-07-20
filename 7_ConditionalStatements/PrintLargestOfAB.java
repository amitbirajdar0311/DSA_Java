import java.util.*;

public class PrintLargestOfAB {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number as a = ");
    int a = sc.nextInt();
    System.out.println("Enter second number as b = ");
    int b = sc.nextInt();

    if (a > b) {
      System.out.println(a + " is largest of a, b");
    } else {
      System.out.println(b + "is largest of a, b");
    }
    sc.close();
  }
}
