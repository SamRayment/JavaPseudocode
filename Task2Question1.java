import java.util.Scanner;

public class Task2Question1
{

    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a saying");
        String saying= input.nextLine();
        
        while (saying.equals(" ")){
            System.out.println("Please enter a saying");
            saying= input.nextLine();
        }
        String numberOfWords[]= saying.split(" ");
        System.out.println("The number of words: "+numberOfWords.length);


}
}