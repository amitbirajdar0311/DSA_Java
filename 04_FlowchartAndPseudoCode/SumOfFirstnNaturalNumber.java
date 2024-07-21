import java.util.*;

public class SumOfFirstnNaturalNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number n : ");
    int n = sc.nextInt();

    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println("sum of first n natural number is : " + sum);

    sc.close();
  }
}
