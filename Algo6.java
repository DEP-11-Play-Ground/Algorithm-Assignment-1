import java.util.Scanner;

public class Algo6 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String text ;
        String reverse = "";
        String word = "";

        do{
         System.out.print("Enter a text : ");
         text = scanner.nextLine();
         if(text.isBlank()) System.out.println("Input can't be empty");
        }while(text.isBlank());

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != ' '){
                word += text.charAt(i);
                
            }else{
                System.out.println(word);
                reverse = word +" "+ reverse;
                word = "";
            }

            if(i==text.length() - 1){
                System.out.println(word);
                reverse = word +" "+ reverse;
            }
            
        }
      System.out.println(reverse);

    }
    
}
