import java.util.Arrays;

public class Algo8 {
    public static void main(String[] args) {
        
        int[] numA = { 5, 7, -2, 3, 4, 6, -8 };
        int[] numB = { 7, 8, -8, 2, 1, -9, 6 };

          int[] temp = new int[numA.length];
        int count = 0;

        for (int j = 0; j < numA.length; j++) {

            for (int i = 0; i < numB.length; i++) {
                if (numA[j] == numB[i]) {
                    temp[count] = numA[j];
                    count++;
                }
            }

        }

        int[] AandB = new int[count];
        for (int i = 0; i < AandB.length; i++) {
            AandB[i] = temp[i];
        }

        int[] aArray = new int[numA.length - count];
        int[] bArray = new int[numA.length - count];
        int a = 0;
        int b = 0;

        for (int i = 0; i < numA.length; i++) {

            loop: for (int j = 0; j < AandB.length; j++) {

                if (AandB[j] == numA[i]) {
                    break loop;
                }

                if (j == AandB.length - 1) {
                    aArray[a] = numA[i];
                    a++;
                }
            }

        }

        for (int i = 0; i < numB.length; i++) {

            loop: for (int j = 0; j < AandB.length; j++) {
          
                if (AandB[j] == numB[i]) {
                    break loop;
                }

                if (j == AandB.length - 1) {
                    bArray[b] = numB[i];
                    b++;
                }
            }

        }

       System.out.println("numA numB Intersection: "+Arrays.toString(AandB));

       System.out.print("Union of numA and numB: [ ");
       for (int i = 0; i < aArray.length; i++) {
        System.out.print(aArray[i] + ", "); 
       }
       for (int i = 0; i < AandB.length; i++) {
        System.out.print(AandB[i] + ", "); 
       }
        for (int i = 0; i < bArray.length; i++) {
        System.out.print(bArray[i] + ", ");    
       }
       System.out.println("\b\b ]");
      
        System.out.println("numA / numB: "+Arrays.toString(aArray));
        System.out.println("numB / numA: "+Arrays.toString(bArray));



        System.out.print("Symetric Difference of numA and numB: [ ");
       for (int i = 0; i < aArray.length; i++) {
        System.out.print(aArray[i] + ", "); 
       }
        for (int i = 0; i < bArray.length; i++) {
        System.out.print(bArray[i] + ", ");    
       }
       System.out.println("\b\b ]");

    }
}
