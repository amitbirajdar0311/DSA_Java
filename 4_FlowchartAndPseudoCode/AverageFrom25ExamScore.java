import java.util.*;

public class AverageFrom25ExamScore {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    
    for (int i = 1; i <= 25; i++) {
      sum += (int) (Math.random() * 10);
      
    }

    System.out.println(sum);
    sc.close();
  }
}
