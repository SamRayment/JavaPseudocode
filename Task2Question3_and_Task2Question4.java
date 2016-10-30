import java.util.Scanner;

public class Task2Question3_and_Task2Question4
{

    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word: ");
        String word= input.nextLine();
        
        while (word.equals(" ")){
            System.out.println("Please enter word: ");
            word= input.nextLine();
        }
        int lengthOfWord= word.length();
        int start=0;
        int end=1;
        for (int character=0; lengthOfWord>character; character++){
            String letter=word.substring(start,end);
            if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e")||letter.equalsIgnoreCase("i")||letter.equalsIgnoreCase("o")||letter.equalsIgnoreCase("u")){
                System.out.println(letter+ " is a vowel");
            } else {
                System.out.println(letter+" is a consonant");
            }
            start++;
            end++;  
    }
}
}