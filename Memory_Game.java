import java.util.Scanner;
import java.util.Random;
public class Memory_Game {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        Random rand = new Random();
        int size=0, score=0,round=3;

        System.out.println("     =====Memory Game=====");
        System.out.println("Hello player, Let's begin the game");
        System.out.println(" Set the difficulty level");
        System.out.println("1. Easy (3 Numbers)");
        System.out.println("2. Medium (5 Numbers)");
        System.out.println("3. Hard (7 Numbers)");
        System.out.print(" Enter your Choice : ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1: size =3;break;
            case 2: size =5;break;
            case 3: size =7;break;
            default:
                System.out.println("Invalid choice, automatically set to Easy level");
                size =3;
                break;
        }
            for(int i=1;i<=round;i++)
            {
                int[] number = new int[size];
                for(int j=0;j<size;j++)
                {
                    number[j] = rand.nextInt(90)+10;
                }

                System.out.println("Round "+i+ " Memorize the Numbers");
                for(int j=0;j<size;j++)
                {
                    System.out.print(number[j]+" ");
                }
                 System.out.println("\n press enter if you are ready to continue");
                //  sc.nextInt();
                 sc.nextLine();
                for(int e=0;e<30;e++)
                {
                    System.out.println();
                }
                int pos=rand.nextInt(size);
                System.out.println("What is the number at   " +(pos+1)+ "??");
                int useranswer = sc.nextInt();
                sc.nextLine();
                if(useranswer==number[pos])
                {
                    System.out.println("Congratulations, Correct answer.... " +number[pos]);
                    score++;
                }
                else
                {
                    System.out.println(" Wrong Answer...., Try again later mate");
                    System.out.println("Correct answer was  "+number[pos]);
                }
            }
            System.out.println("Game over.... \n Your Score "+score+ " out of rounds "+round);
            sc.close();
    }
}
