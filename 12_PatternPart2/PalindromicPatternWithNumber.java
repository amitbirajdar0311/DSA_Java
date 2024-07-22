import java.util.*;
public class PalindromicPatternWithNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            //section 1 : spacess 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //section 2 left pyramid
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //section 3 right pyramid
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        sc.close();
    }
}
