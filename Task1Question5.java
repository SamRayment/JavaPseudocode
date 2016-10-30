import java.util.Scanner;
public class Task1Question5
{
    public static void lastname(String name)
    {
        int startOfMiddleName=name.indexOf(" ");
        int startOfLastName=name.lastIndexOf(" ");
        
        String middleName=name.substring(startOfMiddleName+1,startOfLastName);
        String lastName=name.substring(startOfLastName+1);
        
        System.out.println(name.substring(0,1));
        System.out.println(middleName.substring(0,1));
        System.out.println(lastName.substring(0,1));
    }
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter first name and last name: ");
        String name= input.nextLine();
        
        lastname(name);
    }
}
