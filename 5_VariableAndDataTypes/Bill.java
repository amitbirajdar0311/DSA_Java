import java.util.*;

public class Bill {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a cost of Pencil");
    float pencil = sc.nextFloat();

    System.out.println("Enter a cost of Pen");
    float pen = sc.nextFloat();

    System.out.println("Enter a cost of Eraser");
    float eraser = sc.nextFloat();

    System.out.println(
      "Total Bill without 18% GST is = " + (pen + pencil + eraser)
    );

    float bill = (pen + pencil + eraser) * 0.18f + (pen + pencil + eraser);
    System.out.println("Total bill with 18% GST = " + bill);

    sc.close();
  }
}
