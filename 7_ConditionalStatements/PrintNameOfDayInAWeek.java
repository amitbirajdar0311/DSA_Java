import java.util.*;

public class PrintNameOfDayInAWeek {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(
      "Enter a number between 1-7 that belongs to day of week and I will print name of day regarding that number"
    );
    int day = sc.nextInt();
    switch (day) {
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      case 3 -> System.out.println("Wensday");
      case 4 -> System.out.println("Thrusday");
      case 5 -> System.out.println("Friday");
      case 6 -> System.out.println("Satarday");
      case 7 -> System.out.println("Sunday");
      default -> System.out.println("Enter number is out of range");
    }
    sc.close();
  }
}
