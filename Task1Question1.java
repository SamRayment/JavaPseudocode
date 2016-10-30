import java.util.Scanner;

public class Task1Question1
{
    public static int length(String name)
    {
        int lengthOfName=name.length();
        return lengthOfName;
    }
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name= input.nextLine();
        
        System.out.println("The length of name: "+length(name));
    }

}