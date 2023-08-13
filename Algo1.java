import java.util.Scanner;

class Algo1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       
        int number;
        do {

            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();

        } while (number < 0);

        int[] fibArray = new int[number];
        fibArray[1] = 1;
        int i = 2;
        int fibnum;

        do {
            fibnum = fibArray[i - 1] + fibArray[i - 2];
            if (fibnum <= number) {
                fibArray[i] = fibnum;
            }
            i++;
        } while (number >= fibnum);
;
        System.out.print("[ ");
       int j = 0;

       for ( ; j < fibArray.length; j++) {
            
            if(j != 0 && fibArray[j] == 0){
            break; }else{
                System.out.print(fibArray[j]+", ");
            }
            
        }

        System.out.print("\b\b "+"]");
        System.out.println("\nMaximum posible Fibonacci sequence number for "+number+ " is: "+fibArray[j-1]);
    }

}