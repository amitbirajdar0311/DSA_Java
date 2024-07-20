import java.util.*;

public class PositiveOrNegative {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check positive or negative: ");
    int n = sc.nextInt();
    if (n > 0) {
      System.out.println("number is positive");
    } else if (n == 0) {
      System.out.println("number is neither positive nor negative");
    } else {
      System.out.println("number is negative");
    }
    sc.close();
  }
}
