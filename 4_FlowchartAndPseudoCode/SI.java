import java.util.*;

public class SI {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter principle amount: ");
    double p = sc.nextDouble();
    System.out.println("Enter Rate of Interest: ");
    double r = sc.nextDouble();
    System.out.println("Enter the Time : ");
    int t = sc.nextInt();
    System.out.println(
      "Simple Interest on given amount is : " + (p * r * t) / 100
    );
    sc.close();
  }
}
