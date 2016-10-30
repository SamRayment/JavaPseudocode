
import java.util.Scanner;
public class Lottery
{
    public static int firstNumberCheck(int firstNumber)
    {
        while (firstNumber<1 || firstNumber>49)
        {
            Scanner input= new Scanner(System.in);
            System.out.println("Please re-enter first number: ");
            firstNumber= input.nextInt();
        }
        return firstNumber;
    }
    
    public static int secondNumberCheck(int secondNumber)
    {
        while (secondNumber<1 || secondNumber>49)
        {
            Scanner input= new Scanner(System.in);
            System.out.println("Please re-enter second number: ");
            secondNumber= input.nextInt();
        }
        return secondNumber;
    }
    
    public static int thirdNumberCheck(int thirdNumber)
    {
        while (thirdNumber<1 || thirdNumber>49)
        {
            Scanner input= new Scanner(System.in);
            System.out.println("Please re-enter third number: ");
            thirdNumber= input.nextInt();
        }
        return thirdNumber;
    }
    
    public static int fourthNumberCheck(int fourthNumber)
    {
        while (fourthNumber<1 || fourthNumber>49)
        {
            Scanner input= new Scanner(System.in);
            System.out.println("Please re-enter fourth number: ");
            fourthNumber= input.nextInt();
        }
        return fourthNumber;
    }
    
    public static int fifthNumberCheck(int fifthNumber)
    {
        while (fifthNumber<1 || fifthNumber>49)
        {
            Scanner input= new Scanner(System.in);
            System.out.println("Please re-enter fifth number: ");
            fifthNumber= input.nextInt();
        }
        return fifthNumber;
    }
    
    public static int sixthNumberCheck(int sixthNumber)
    {
        while (sixthNumber<1 || sixthNumber>49)
        {
            Scanner input= new Scanner(System.in);
            System.out.println("Please re-enter sixth number: ");
            sixthNumber= input.nextInt();
        }
        return sixthNumber;
    }
    
    public static int bonusNumberCheck(int bonusNumber)
    {
        while (bonusNumber<1 || bonusNumber>49)
        {
            Scanner input= new Scanner(System.in);
            System.out.println("Please re-enter bonus number: ");
            bonusNumber= input.nextInt();
        }
        return bonusNumber;
    }
    
    public static int wins(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber, int sixthNumber)
    {
        int matches=0;
        boolean bonusBall= false;
        
        if (firstNumber==Math.ceil(Math.random()) * 49){
            matches++;
        }
        
        if (secondNumber==Math.ceil(Math.random()) * 49){
            matches++;
        }
        
        if (thirdNumber==Math.ceil(Math.random()) * 49){
            matches++;
        }
        
        if (fourthNumber==Math.ceil(Math.random()) * 49){
            matches++;
        }
        
        if (fifthNumber==Math.ceil(Math.random()) * 49){
            matches++;
        }
        
        if (sixthNumber==Math.ceil(Math.random()) * 49){
            matches++;
        }
 
        return matches;
    }
    
    public static boolean bonusBall(int bonusNumber)
    {
       boolean bonusBall= false;
        if (bonusNumber==Math.ceil(Math.random()) * 49){
            bonusBall= true;
        }
        return bonusBall;
    }
    
    public static void earnings(int matches, boolean bonusBall)
    {
        if (matches==3){
            System.out.println("You have won £10!");
        }
        
        if (matches==4){
            System.out.println("You have won £100!");
        }
        
        if (matches==5 && bonusBall==true){
            System.out.println("You have won £100,000!");
        } else if (matches==5 && bonusBall==false){
            System.out.println("You have won £10,000!");
        }
        
        if (matches==6){
            System.out.println("You have won £1,000,000!");
        } else{
            System.out.println("You have won £0");
        }
    }
    
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber= input.nextInt();
        
        System.out.println("Please enter second number: ");
        int secondNumber= input.nextInt();
        
        System.out.println("Please enter third number: ");
        int thirdNumber= input.nextInt();

        System.out.println("Please enter fourth number: ");
        int fourthNumber= input.nextInt();

        System.out.println("Please enter fifth number: ");
        int fifthNumber= input.nextInt();

        System.out.println("Please enter sixth number: ");
        int sixthNumber= input.nextInt();
        
        System.out.println("Please enter bonus number: ");
        int bonusNumber= input.nextInt();
        
        firstNumber=firstNumberCheck(firstNumber);
        secondNumber=secondNumberCheck(secondNumber);
        thirdNumber=thirdNumberCheck(thirdNumber);
        fourthNumber=fourthNumberCheck(fourthNumber);
        fifthNumber=fifthNumberCheck(fifthNumber);
        sixthNumber=sixthNumberCheck(sixthNumber);
        bonusNumber=bonusNumberCheck(bonusNumber);
        
        int matches= wins(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber, sixthNumber);
        boolean bonusBall= bonusBall(bonusNumber);
        
        earnings(matches, bonusBall);
    }
}