import java.util.*;
public class PrintHW100Times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter now many times you want to print");
        int n = sc.nextInt();
        int a = 1;
        while(a<=n){
            System.out.println("HW : ->" + a);
            a++;
        }
        sc.close();
    }
}
