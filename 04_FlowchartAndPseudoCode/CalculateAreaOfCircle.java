import java.util.*;

public class CalculateAreaOfCircle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of Circle");
    double radius = sc.nextDouble();
    System.out.println("Area of Circle is = " + (3.14 * radius * radius));
    sc.close();
  }
}
