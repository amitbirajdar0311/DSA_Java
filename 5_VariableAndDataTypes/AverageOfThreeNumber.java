import java.util.*;
public class AverageOfThreeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: a = ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: b ");
        int b = sc.nextInt();
        System.out.println("Enter Third number");
        int c = sc.nextInt();
        System.out.println("AVerage of Three Number is = " + (a+b+c)/3);
        sc.close();

    }
}