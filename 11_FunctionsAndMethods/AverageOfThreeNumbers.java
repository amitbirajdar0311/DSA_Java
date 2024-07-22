import java.util.*;

public class AverageOfThreeNumbers {

  public static void averageOfThreeNumber(int a, int b, int c) {
    System.out.println("average of a,b,c = " + (a+b+c)/3);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number as a = ");
    int a = sc.nextInt();
    System.out.println("Enter Second Number as b = ");
    int b = sc.nextInt();
    System.out.println("Enter Third Number = ");
    int c = sc.nextInt();
    averageOfThreeNumber(a, b, c);

    sc.close();
  }
}
