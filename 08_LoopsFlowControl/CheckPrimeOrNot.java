import java.util.*;

public class CheckPrimeOrNot {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter a number to check it is prime or not");
    int n = sc.nextInt();
    boolean flag = false;

    if(n<=1){
        System.out.println("not a prime number");
    }
    else{
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag = true;
                break;
            }
        }

        if(flag == true){
            System.out.println("Not a prime number");
        }else{
            System.out.println(" prime number");
        }
    }
    sc.close();
  }
}
