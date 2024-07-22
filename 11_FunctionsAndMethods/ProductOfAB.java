import java.util.*;
public class ProductOfAB {
    public static void productOfAB(int a,int b){
        System.out.println("product is = " + (a*b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        productOfAB(a,b);
        sc.close();
    }
}
