import java.util.*;

public class CalculateRootsOfQuadraticEquation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double d = Math.pow(b, 2) - 4 * a * c;
    if (d > 0) {
      System.out.println("Roots are : ");
      double root1 = (-b + Math.sqrt(d)) / 2 * a;
      double root2 = (-b - Math.sqrt(d)) / 2 * a;

      System.out.println("Roots are real and distinct");
      System.out.println("root1  == " + root1);
      System.out.println("root2 is = " + root2);
    } else if (d == 0) {
      System.out.println("Roots are : ");
      double root = -b / 2 * a;
      System.out.println("Roots are real and equal");
      System.out.println("root1 = root2 = " + root);
    } else {
      System.out.println("roots are imaginary");
    }
    sc.close();
  }
}
