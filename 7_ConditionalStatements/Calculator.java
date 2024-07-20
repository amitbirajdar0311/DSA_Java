import java.util.*;

public class Calculator {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number as a : ");
    int a = sc.nextInt();
    System.out.println("Enter a operator to perform operation");
    char opeartor = sc.next().charAt(0);
    System.out.println("Enter second number as b: ");
    int b = sc.nextInt();
    switch (opeartor) {
      case '+':
        System.out.println("a + b = " + (a + b));
        break;
      case '-':
        System.out.println("a - b = " + (a - b));
        break;
      case '*':
        System.out.println("a * b = " + (a * b));
        break;
      case '/':
        System.out.println(" a / b = " + (a / b));
        break;
      case '%':
        System.out.println("a % b = " + (a % b));
        break;
      default:
        System.out.println("operator is not exist");
    }
    sc.close();
  }
}
