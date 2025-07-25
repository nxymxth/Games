import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
        Scanner clcy = new Scanner(System.in);
        System.out.println(" Enter the first number");
        int a = clcy.nextInt();

        System.out.println(" Enter the Second number");
        int b = clcy.nextInt();

        clcy.nextLine();

        System.out.println(" Enter the Arthimetic Operator (+,-,*,/,%)");
        String input = clcy.nextLine();
        if(input.length()==0)
        {
            System.out.println("No operator entered, Please enter valid operator");
        }
        char ch = input.charAt(0);
        switch (ch) {
            case '+':
            System.out.println(" The sum of a+b= " + (a + b));
            break;

            case '-':
            System.out.println("The subtraction of a-b= "+(a-b));
            break;

            case '*':
            System.out.println("The multiplication of a*b= " +(a*b));
            break;

            case '/':
            if(b!=0)
        {
            System.out.println("The Division of a/b= " +(a/b));
            
        }
        else
        {
            System.out.println(" The division of 0 is not possible ");
            System.out.println(" itna bhi nai malum re bail ke 5we");
        }
        break;

        case '%':
        if(b !=0)
        {
            System.out.println(" The modolus of a%b= " +(a%b));

        }
        else
        {
            System.out.println(" The modulus of 0 is not possible ");
            System.out.println(" jab teko pahle ich padai thay ki division of 0 is not possible bolke phir kaiku phugat ke hushariya karna re ");
            System.out.println(" bail ke 5we");
        }
        break;

            default:
            System.out.println(" Kaiku zinda hai re tuu");
            System.out.println(" Teko padna aata na ");
            System.out.println(" upper pahle ich bola mai yee operators use kar bolke ");
            System.out.println(" isse hat ke kounse operators rahte re ");
            break;
        }
        clcy.close();
    }

}
