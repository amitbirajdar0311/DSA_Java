import java.util.*;
public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimal = sc.nextInt();
        int bin =0;
        int pow = 0;
        while(decimal>0){
            int lastDigit = decimal%2;
            bin+=(lastDigit*Math.pow(10,pow));
            pow++;
            decimal/=2;
        }
        System.out.println("Bin is = " + bin);
        sc.close();
    }
}
