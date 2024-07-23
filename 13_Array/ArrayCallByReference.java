import java.util.*;
public class ArrayCallByReference {
    public static void update(int[] marks){
        for(int i=0;i<marks.length;i++){

            marks[i] +=1;
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = {80 ,90 ,95};
        update(marks);

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        sc.close();
    }
}
