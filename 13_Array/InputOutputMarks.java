import java.util.*;
public class InputOutputMarks{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[100];
        for(int i=0;i<3;i++){
            System.out.println("Enter mark of subject code : " + i);
            marks[i] = sc.nextInt();
        }

        marks[2] = 100;
        for(int i=0;i<3;i++){
            System.out.println("mark of subject code " + i + "is " + marks[i]);
        }

        sc.close();
    }
}