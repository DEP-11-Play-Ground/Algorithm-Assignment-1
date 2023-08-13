import java.util.Arrays;
import java.util.Scanner;

public class Algo7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String sentence;
        do{
            System.out.print("Enter a sentence: ");
            sentence = scanner.nextLine();
            if(sentence.isBlank())System.out.println("Sentence can't be empty");
        }while(sentence.isBlank());

        String[] words = new String[sentence.length()];
        String word = "";
        int k = 0;

        for (int i = 0; i < words.length; i++) {
            if(sentence.charAt(i) != ' '){
                word += sentence.charAt(i);
            }else{
                words[k] = word;
                k++;
                word = "";
            }
            if(i == words.length - 1){
                words[k] = word;
            }
        }
        int longWord = words[0].length();
        int shortWord = words[0].length();
        int l=0;
        int s=0;

        for (int i = 1; i < words.length && words[i] != null; i++) {
            
            if(words[i].length() > longWord){
                l = i;
                longWord = words[i].length();
            }

            if(words[i].length() < shortWord){
                s = i;
                shortWord = words[i].length();
            }
        }

        //System.out.println(Arrays.toString(words));
        System.out.println("longest word is: ["+ words[l]+"] and its length is: "+ longWord);
        System.out.println("Shortest word is: ["+ words[s]+"] and its length is: "+ shortWord);

    }
}
