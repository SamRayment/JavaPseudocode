import java.util.Scanner;
public class Task1Question2
{
    public static void conversion(String postcode)
    {
        String postcodeToUpperCase=postcode.toUpperCase();
        System.out.println(postcodeToUpperCase);
    }
    
    public static void main(String[]args)
    {
      Scanner input= new Scanner(System.in);
      System.out.println("Please enter postcode: ");
      String postcode= input.nextLine();
      
      conversion(postcode);
    }
}
