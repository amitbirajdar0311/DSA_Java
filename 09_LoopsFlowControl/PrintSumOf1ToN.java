import java.util.*;
public class PrintSumOf1ToN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number upto we have to print sum from 1");
        int number  =sc.nextInt();
        int sum = 0;
        int interator = 1;
        while(interator<=number){
            sum+=interator;
            interator++;
        }
        System.out.println("sum = " + sum);
        sc.close();
    }
    
}
