import java.util.*;

public class IncomeTaxCalulator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you income : ");
    int income = sc.nextInt();
    int tax;
    if (income < 5_00_000) {
      tax = 0;
    } else if (income >= 5_00_000 && income < 10_00_000) {
      tax = (int) (income * 0.20);
    } else {
      tax = (int) (income * 0.30);
    }
    System.out.println("your tax is = " + tax);
    sc.close();
  }
}
