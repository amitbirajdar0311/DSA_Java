import java.util.*;

public class PrintNumber1ToN {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter upto how many numbers we have to print");
    int range = sc.nextInt();
    int iterator = 1;
    while (iterator <= range) {
      System.out.println(iterator);
      iterator++;
    }
    sc.close();
  }
}
