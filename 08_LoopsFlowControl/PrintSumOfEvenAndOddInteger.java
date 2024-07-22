import java.util.*;

public class PrintSumOfEvenAndOddInteger {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");

    int number;
    int choice;
    int evenSum = 0;
    int oddSum = 0;

    do {
      System.out.println("Enter a number");
      number = sc.nextInt();
      if (number % 2 == 0) {
        evenSum += number;
      } else {
        oddSum += number;
      }

      System.out.println(
        "Do you want to continue then press 1 and for end press 0"
      );
      choice = sc.nextInt();
    } while (choice == 1);

    System.out.println("EVen sum = " + evenSum);
    System.out.println("odd sum = " + oddSum);
    sc.close();
  }
}
