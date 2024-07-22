public class PrintReverseOfNumber {
    public static void main(String[] args) {
        int number = 10899;
        int reversNumber = 0;
        while(number>0){
            int lastdigit = number%10;
            reversNumber = (int)(reversNumber*10+lastdigit);
            number/=10;
        }
        System.out.println(reversNumber);
        System.out.println(number);
    }    
}
