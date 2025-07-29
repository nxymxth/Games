import java.util.Scanner;
public class Password_Cracker 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       String password = "nigga1212";
       int maxattempt=3;
       boolean playagain=true;
       
       while(playagain)
       {
        System.out.println("Welcome to Password Cracker Game");
        System.out.println("In this game you will be having 3 attempts to guess the correct password");
        System.out.println("Enter 'HINT' to get a clue");
        for (int i=1; i<=maxattempt; i++)
        {
            System.out.println("attempt" + i + " ");

        String clue = sc.nextLine();
      
        if(clue.equalsIgnoreCase("hint"))
        {
        System.out.println("Enter either 1,2,3, for a clue");
        System.out.println(" Enter 1. for the first letter of the password ");
        System.out.println("Enter 2. for the length of password");
        System.out.println("Enter 3. for the last letter of the password");
        
         int choice = sc.nextInt();
         sc.nextLine();
         switch(choice)
         {
            case 1:
                System.out.println("The first letter of the password is 'n'");
                break;
            case 2:
                System.out.println("The length of the password is 9 characters");
                break;
            case 3:
                System.out.println("The last letter of the password is '2'");
                break;
            default:
                System.out.println("Invalid choice, please try again.");
         }
         i--;
         continue;
        }
        if(clue.equals(password))
        {
            System.out.println("Congratulations!!! Your have cracked the password");
            break;
        }
        else if(i<maxattempt)
        {
            System.out.println("Wrong password, Try again");
        }
        else
        {
            System.out.println("You have used your all attempts");
        }
    }
        System.out.println("\n Do you want to try again (yes/no)");
        String answer =sc.nextLine().toLowerCase();
        if(!answer.equals("yes"))
        {
            playagain = false;
            System.out.println("Thank you for playing again");
          }
}
sc.close();
}
}


