import java.util.Scanner;

public class Task2Question5
{
    
    public static void main(String[]args)
    {
        String randomWord="RANDOM";
       
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a six letter word: ");
        String userInput= input.nextLine();
        String userWord=userInput.toUpperCase();
        
         while(!userWord.equals(randomWord)){
                String firstUserLetter=userWord.substring(0,1);
                String secondUserLetter=userWord.substring(1,2);
                String thirdUserLetter=userWord.substring(2,3);
                String fourthUserLetter=userWord.substring(3,4);
                String fifthUserLetter=userWord.substring(4,5);
                String sixthUserLetter=userWord.substring(5);
                
                String firstRandomLetter=randomWord.substring(0,1);
                String secondRandomLetter=randomWord.substring(1,2);
                String thirdRandomLetter=randomWord.substring(2,3);
                String fourthRandomLetter=randomWord.substring(3,4);
                String fifthRandomLetter=randomWord.substring(4,5);
                String sixthRandomLetter=randomWord.substring(5);
                
                if (firstUserLetter.equals(firstRandomLetter)){
                    System.out.print(firstUserLetter);
                }   else{
                    System.out.print("?");
                }
                
                if (secondUserLetter.equals(secondRandomLetter)){
                    System.out.print(secondUserLetter);
                }   else{
                    System.out.print("?");
                }
            }
        }
    }