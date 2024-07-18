import java.util.*;

public class AreaOfSquare {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side of Square");
    int side = sc.nextInt();
    System.out.println("Area of squre is = " + (side * side));
    sc.close();
  }
}
