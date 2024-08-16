public class ReverseAnArray {
    public static void reverseAnArray(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return;
    }
    public static void reverseAnArrayInOptimizedWay(int[] arr){
        int start = 0, end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10};
        reverseAnArray(arr);
        reverseAnArrayInOptimizedWay(arr);
    }
}
