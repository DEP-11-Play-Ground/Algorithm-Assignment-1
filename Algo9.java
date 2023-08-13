import java.util.Scanner;

public class Algo9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String word;
        
        do{
        System.out.print("Enter a sentence: ");
            word= scanner.nextLine();
            if(word.isBlank())System.out.println("Sentence can't be empty");
        }while(word.isBlank());

        System.out.println(word);

      loop:  for (int i = 0; i < word.length()/2; ) {
            
            if(word.charAt(i) == word.charAt(word.length()-1-i)){
             //   System.out.println("i"+i +" "+ word.length()/2);
              
             if(i == (word.length()/2)-1){
                 //   System.out.println("working");
                    System.out.println(word+ " is a pilindrome");
                    break loop;
                }
                i++;
               // System.out.println(i);
            }else{
                System.out.println(word + " is not pilindrome");
                break loop;
            }



        }

        
    }
}
