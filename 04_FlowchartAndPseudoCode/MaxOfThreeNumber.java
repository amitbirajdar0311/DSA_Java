import java.util.*;

public class MaxOfThreeNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: a = ");
    int a = sc.nextInt();
    System.out.println("Enter Second number: b =");
    int b = sc.nextInt();
    System.out.println("Enter Third Number: c =");
    int c = sc.nextInt();

    System.out.println(Math.max(a, Math.max(b, c)));
    sc.close();
  }
}
