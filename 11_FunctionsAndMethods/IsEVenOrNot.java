import java.util.*;
public class IsEVenOrNot {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check!!");
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }

        sc.close();
    }
}
