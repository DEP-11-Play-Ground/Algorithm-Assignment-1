import java.util.Scanner;

public class Algo5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String text ;
       do{
        System.out.print("Enter a text : ");
        text = scanner.nextLine();
        if(text.isBlank()) System.out.println("Input can't be empty");
    }while(text.isBlank());

    String reverseText = "";

    for (int i = text.length()-1; i >=0 ; i--) {
        reverseText += text.charAt(i);
        
    }
     
    System.out.println("Reversed text : "+reverseText);

    }
}
