import java.util.Scanner;

public class Tressure_Hunt {
            public static void main(String[] args)
            {
                System.out.println("Welcome to the Treassure Hunt Game!!!");
                System.out.println("Let me explain you about the game");
                System.out.println(" In this game you will be having three caves CAVE1, CAVE2, CAVE3");
                System.out.println(" Anyone of the cave will have a treasure, one is empty and one has the Dragon which protects the treasure");
                System.out.println(" choose any Cave to start the game");
                System.out.println(" lets start the game");
                System.out.println("Choose the Cave(1/2/3) :");
                Scanner Scanner = new Scanner(System.in);
                int caveNumber = Scanner.nextInt();
                // String cave = Scanner.nextLine();
                if (caveNumber == 1)
                {
                    System.out.println("Oh!! you felt in a trap");
                    System.out.println("This is an empty cave");
                    System.out.println(" You have the worst choice ever");
                    System.out.println(" I hope you will never come back");
                    System.out.println(" Game over");
                }
                else if( caveNumber == 2)
                {
                    System.out.println(" You found the cave and glowing treasure is infornt of you");
                    System.out.println(" You want to open the Chest ( yes/no)");
                    Scanner.nextLine(); // consume the leftover newline
                    String choice = Scanner.nextLine();
                    if (choice.equalsIgnoreCase("yes"))
                    {
                        System.out.println(" Congratulations !!!!! you won the game ");
                    }
                    else if (choice.equalsIgnoreCase("no"))
                    {
                        System.out.println(" You missed the Treasure , better luck next time!!!");
                        System.out.println("You are a winner but for what cause ??");
                        System.out.println(" Game over");
                    }
                }
                else if(caveNumber == 3)
                {
                    System.out.println("Oh no!! you entered the cave of Dragon");
                    System.out.println(" You woke up the Dragon");
                    System.out.println(" The Dragon is angry and it is going to eat you");
                    System.out.println(" Game over");
                }
                else
                {
                    System.out.println(" Invalid choice , try again later");
                    System.out.println(" Stupid you have to chose between 1,2,3");
                    System.out.println(" Stupid dont come back again");
                    System.out.println(" Game over");
                }
                    Scanner.close();

            }
}
