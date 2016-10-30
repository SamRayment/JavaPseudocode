import java.util.Scanner;

public class Task2Question2
{

    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter word");
        String word= input.nextLine();
        while (word.equals(" ")){
            System.out.println("Please enter word");
            word= input.nextLine();
        }
        int numberOfCharacters= word.length();
        int endPosition= numberOfCharacters;
        int startPosition= numberOfCharacters-1;
       
        for (int i=numberOfCharacters-1; i>=0; i--){
            System.out.print(word.substring(startPosition,endPosition));
            endPosition--;
            startPosition--;
    }
        System.out.println();
}
}