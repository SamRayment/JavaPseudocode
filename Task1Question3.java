import java.util.Scanner;

public class Task1Question3
{

    public static void verification(String password, String passwordVerified)
    {
        while(!(password).equals(passwordVerified)){
           Scanner input= new Scanner(System.in);
           System.out.println("Passwords do not match. Please enter again");
           password= input.nextLine();
           
           System.out.println("Please enter password again");
           passwordVerified= input.nextLine();
        }
    } 
    
    public static void main(String[]args)
    {
       Scanner input= new Scanner(System.in);
       System.out.println("Please enter password");
       String password= input.nextLine();
    
       System.out.println("Please enter password again");
       String passwordVerified= input.nextLine();
       
       verification(password,passwordVerified);
       
       System.out.println("Password verified");
       
    }
}