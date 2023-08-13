import java.util.Scanner;

public class Algo10 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
String phoneNumber ;
        do{
            System.out.print("Enter a sentence: ");
                phoneNumber= scanner.nextLine();
                if(phoneNumber.isBlank())System.out.println("Sentence can't be empty");
            }while(phoneNumber.isBlank());
     
        int numCount = 0;

        for (int i = 0; i < phoneNumber.length(); i++) {
            if(Character.isDigit(phoneNumber.charAt(i))){
               numCount++;
           
            }}
        

        if(numCount == 10){

loop: for (int j = 0; j < phoneNumber.length(); j++) {
            
            if(j == 0 || j == 3)continue;
            
            char a = phoneNumber.charAt(j);
           
            if(!Character.isDigit(a)){
                System.out.println("1Invalid Phone number");
                break loop;
            }
            if(j == phoneNumber.length()-1) System.out.println("Number is validated");
           }
        }

        else  if(numCount == 11){

        
loop2: for (int j = 0; j < phoneNumber.length(); j++) {
            
            if(j == 0 || j == 3 || j == 6)continue;
                     
            if(!Character.isDigit( phoneNumber.charAt(j))){
                System.out.println("2Invalid Phone number");
                break loop2;
            }
            if(j == phoneNumber.length()-1) System.out.println("Number is validated");
           }
        }
        else if (numCount!=10 || numCount!=11){System.out.println("Invalid phone number");}
      }
 
   }

