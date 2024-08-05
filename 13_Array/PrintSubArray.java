public class PrintSubArray {

  public static void main(String[] args) {
    int[] arr = { 2, 4, 6, 8, 10 };
    int totalSubArray = 0;
    //starting index
    for (int i = 0; i < arr.length; i++) {
      //ending index
      for (int j = i; j < arr.length; j++) {
        //print numers between starting and ending index
        for (int k = i; k <= j; k++) {
          System.out.print(arr[k] + " ");
          
        }
        totalSubArray++;
        System.out.println();
      }

      System.out.println();
    }

    System.out.println("toatal sub Array = " + totalSubArray);
  }
}
