import java.util.*;

public class EvenOrOdd {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check even or odd");
    int number = sc.nextInt();
    if (number % 2 == 0) {
      System.out.println("Given number is even");
    } else {
      System.out.println("Given number is odd!!");
    }
    sc.close();
  }
}
