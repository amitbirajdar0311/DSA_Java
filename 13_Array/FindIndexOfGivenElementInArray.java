import java.util.*;

public class FindIndexOfGivenElementInArray {

    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }

        return -1;
    } 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };
    int key = 10;
    
    if(linearSearch(arr,key) == -1){
        System.out.println("index is not in array");
    }else{
        System.out.println("index is = " + linearSearch(arr, key));
    }
    sc.close();

  }
}
