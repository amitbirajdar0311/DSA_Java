import java.util.*;
public class BinToDec {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a binary number ");
        int binary = sc.nextInt();
        int decimal=0;
        int i=0;
        while(binary>0){
            int lastDigit = binary%10;//1
            decimal+=(Math.pow(2,i)*lastDigit);//
            i++;
            binary/=10;
        }
        System.out.println("Decaimal is " +  decimal);
        sc.close();
    }
}
