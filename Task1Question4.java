import java.util.Scanner;
public class Task1Question4
{
    public static void lastname(String name)
    {
        int startOfLastName=name.indexOf(" ");
        String lastName=name.substring(startOfLastName);
        System.out.println("Hello "+lastName);
    }
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter first name and last name: ");
        String name= input.nextLine();
        
        lastname(name);
    }
}
