import java.util.Scanner;
import java.util.Random;
public class SimonSays 
{
        public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            int round =5;
            int score =0;
            
            //initilizing the actions need to  be displayed ....
            String[] actions={"jump" , "run" , "blink" , "clap" , "dance"};

            // Explaination of the rules to proceed with game 
            System.out.println("=====Welcome to game=====");
            System.out.println("Follow the game only on 'SIMON SAYS' or else you will lose the game ");
            System.out.println("Type 'yes' or 'no' to continue the game ");
            System.out.println("Lets start the game ...");

            // initilize the iteration until the all rounds are completed 

            for(int i =1; i<=round;i++)
        {

                System.out.println("Round " +i+ ":");
                // Random string generator .....
                String actionChosen = actions[rand.nextInt(actions.length)];

                // this boolean have 50-50 chance of printing simon says
                // if its ture then it prints Simon says else it will just actions ....
                boolean simon = rand.nextBoolean();

                // this is ternary operator will print answer according to boolean ....
                String command = simon ? "Simon Says " + actionChosen : actionChosen;
                System.out.println(command);

                System.out.println("Choose (yes/no)");
                String answer = sc.nextLine().toLowerCase().trim();

                // this will check your input if it matches then it prints correct answer or else it will print wrong answer....
                if (simon && answer.equals("yes"))
                {
                    System.out.println("Correct answer. You gained a point ");
                    score++;
                } else if (!simon && answer.equals("no"))
            {
                System.out.println("correct answer . You gained a point");
                score++;
            }else{
                System.out.println("Wrong answer...better luck next time ");
                if(simon)
                {
                    System.out.println("It clearly says SIMON SAYS if this prints on your screen you have to choose 'yes' ");
                }
                else
                {
                    System.out.println("When screen prints SIMON SAYS then only you have to say 'yes' ");
                }
                
            }
           
        }
        System.out.println("Your final score is : " +score);
        System.out.println("Thanks for playing the game ....");
        System.out.println("Hope will meet you soon");
        sc.close();
}   }
