import java.util.*;
public class CheckNumberIsPrimeOrNot {
    public static void checkPrimeOrNot(int n){
        boolean flag = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }

        if(flag==true){
            System.out.println("is prime number");
        }else{
            System.out.println("not a prime number");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkPrimeOrNot(n);
        sc.close();
    }
}
