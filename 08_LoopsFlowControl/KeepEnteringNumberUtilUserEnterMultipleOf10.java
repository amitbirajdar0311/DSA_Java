import java.util.*;

public class KeepEnteringNumberUtilUserEnterMultipleOf10 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
        int enterNumber = sc.nextInt();
        if(enterNumber%10==0){
            break;
        }
        System.out.println(enterNumber);

    }
    sc.close();
  }
}
