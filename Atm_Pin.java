import java.util.Scanner;
public class Atm_Pin {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String CorrectPin="1903";
        int attempt=3;
        boolean againpin=true;

        while(againpin)
        {
            System.out.println(" Welcome to Black Bank ATM service online ");
            // System.out.println(" Enter your account number");
            // int accountnumber = sc.nextInt();
            // sc.nextLine();
            System.out.println("You got 3 attempts to enter the correct pin");
            for (int i=1;i<=attempt;i++)
            {
                System.out.println("Enter your pin");
                String pin= sc.nextLine();
                if(pin.equals(CorrectPin))
                {
                    System.out.println("You have entered your pin correctly");
                    // System.out.println("Your account number is " +accountnumber);
                    System.out.println("Now you can accsess your account");
                    System.out.println("Enter 1. to check your balance");
                    System.out.println("Enter 2. to widthdraw your money");
                    System.out.println("Enter 3. to exit ATM Service");
                    int choice =sc.nextInt();
                    sc.nextLine();
                    switch(choice)
                    {
                        case 1:
                        System.out.println("Your balance is 6000/-");
                        break;
                        case 2:
                        System.out.println("ENter the amount you want to widthdraw");
                        int widthdraw =sc.nextInt();
                        sc.nextLine();
                        if(widthdraw<=6000)
                        {
                            System.out.println("Enter the pin to confirm widthdraw");
                            String confirmpin = sc.nextLine();
                            if(confirmpin.equals(CorrectPin))
                            {
                                int newbalance=6000-widthdraw;
                            System.out.println("Please collect your cash");
                            System.out.println("Your new balance is "+newbalance);
                            }
                            else
                            {
                                System.out.println("You have entered wrong pin");
                            }
                        }
                        else
                        {
                            System.out.println("You dont have enough balance");
                
                        }
                        break;
                        case 3:
                        System.out.println("Thanks for using our atm bank");
                        break;
                        default:
                        System.out.println("Invalid user request");
                        break;
                    }
                    break;
                }
                else if(i<attempt)
                {
                    System.out.println("You have entered wrong pin");
                    System.out.println("try again");
                    System.out.println("attempts left ="+(attempt-i));
                }
                else
                {
                    System.out.println("You have used your all attempts");
                    System.out.println("your account is blocked");
                    System.out.println(" Please contact bank to unblock your account and reset your pin");
                }
            }
            System.out.println("Do you want to try again(yes /no)");
            String response = sc.nextLine().toLowerCase();
            if(!response.equals("yes"))
            {
                againpin=false;
                System.out.println("Thanks for using our ATM Service");
            }
        }
        sc.close();
    }
}
