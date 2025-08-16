import java.util.Scanner;
import java.util.Random;

public class SnakeLadder {

    public static int rollDie() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public static int checkPosition(int pos, int[] snake, int[] ladder) {
        for (int i = 0; i < snake.length; i += 2) {
            if (pos == snake[i]) {
                System.out.println("Oops snake bite you, go down from " + pos + " to " + snake[i+1]);
                return snake[i + 1];
            }
        }
        for (int i = 0; i < ladder.length; i += 2) {
            if (pos == ladder[i]) {
                System.out.println("Congratulations you climbed ladder from " + pos + " to " + ladder[i+1]);
                return ladder[i + 1];
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] snake = {99,41, 95,67, 89,30, 78,15, 58,2, 54,19, 11,6};
        int[] ladder = {3,45, 8,12, 14,26, 21,39, 31,73, 58,80, 83,97, 90,93};
        int player1 = 0, player2 = 0;
        boolean turn = true;
        System.out.println("======Welcome to the game");
        System.out.println("First to reach 100 wins");
        System.out.println("All the best players, lets start..!!!");

        while(player1 < 100 && player2 < 100) {
            System.out.println(turn ? "Player1's turn" : "Player2's turn");
            System.out.println("Press enter to roll a die");
            sc.nextLine();
            int die = rollDie();
            System.out.println("Rolled die: " + die);

            if(turn) {
                int newPosition = player1 + die;
                if(newPosition <= 100) {
                    player1 = newPosition;
                    player1 = checkPosition(player1, snake, ladder);
                }
                System.out.println("Player1 is at position: " + player1);
            } else {
                int newPosition = player2 + die;
                if(newPosition <= 100) {
                    player2 = newPosition;
                    player2 = checkPosition(player2, snake, ladder);
                }
                System.out.println("Player2 is at position: " + player2);
            }

            // Check if players are on same position (after movement)
            if(player1 == player2 && player1 != 0) {
                if(turn) { // Player1 just moved onto Player2
                    System.out.println("OOPS! Player1 landed on Player2's position!");
                    System.out.println("Player2 has to restart the game");
                    player2 = 0;
                } else { // Player2 just moved onto Player1
                    System.out.println("OOPS! Player2 landed on Player1's position!");
                    System.out.println("Player1 has to restart the game");
                    player1 = 0;
                }
            }

            System.out.println();
            turn = !turn;
        }

        if(player1 >= 100) {
            System.out.println("Congratulations Player1 wins the game!!!!");
        } else {
            System.out.println("Congratulations Player2 wins the game!!!!");
        }
        sc.close();
    }
}