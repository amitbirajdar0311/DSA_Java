import java.util.*;
public class PassOrFail {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of student: ");
        int mark = sc.nextInt();
        System.out.println((mark>=33)?"pass": "fail");
        sc.close();
    }
}
