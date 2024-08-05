import java.util.Scanner;
public class LargestNumberInArray {
    public static void largest(int[] arr){
        int large = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            large = Math.max(large,arr[i]);
        }
        System.out.println("Largest element in an array is : " + large);
        return;
    }

    public static void smallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            smallest = Math.min(smallest,arr[i]);
        }


        System.out.println("Samllest number in an array is : " + smallest);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        largest(arr);
        smallest(arr);
        sc.close();
    }
}
