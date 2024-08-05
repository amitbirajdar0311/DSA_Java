public class PairsInAnArray {
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                count++;
            }
            System.out.println("");
        }
        System.out.println("Total number of paires = " + count);
    }
}
