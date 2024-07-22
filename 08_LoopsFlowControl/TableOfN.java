import java.util.*;
public class TableOfN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for which you want table");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
        sc.close();
    }
}
