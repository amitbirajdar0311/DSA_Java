import java.util.*;
public class PallendromeOrNot {
    public static void isPallendrome(int n){
        int myNumber=n;
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            rev=rev*10+lastDigit;
            n/=10;

        }

        if(myNumber==rev){
            System.out.println("palendrome");
        }else{
            System.out.println("not a plaendrome");
        }

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is pallendrome or not");
        int n = sc.nextInt();
        isPallendrome(n);

        sc.close();
    }
}
