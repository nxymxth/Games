import java.util.Scanner;
import java.util.Random;
public class Rock 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.println(" Welcome to the Game");
        System.out.println("Chose either of the one (Rock,Paper,Scissor)");
        String pc = sc.nextLine().toLowerCase();
        int rando = rn.nextInt(3);
        String cc="";
        
        if (rando==1) cc="rock";
        else if (rando==2) cc="paper";
        else cc="scissor";
        
        System.out.println(" Computer Choice is" +cc);

        if(!pc.equals("rock")&& !pc.equals("paper")&& !pc.equals("scissor"))
        {
                System.out.println(" Invalid choice");
                System.out.println("You have to choose between rock paper or scissor");
        }
        else if(pc.equals(cc))
            {
                System.out.println("Then there is a Tie between computer and You");
            }
        else if (
                (pc.equals("rock") && cc.equals("scissor")) ||
                (pc.equals("paper") && cc.equals("rock")) ||
                (pc.equals("scissor") && cc.equals("paper"))
            )
            {
                System.out.println("Congratulations !!!! You won the game");
            }
        else
            {
                System.out.println("You Lose");
                System.out.println("Better luck next time");
            }
         sc.close();
    }

}
