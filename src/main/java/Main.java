import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        System.out.println("=== Welcome to Rock-Paper-Scissors game ===");
        System.out.println("Enter Player 1 Choice (rock, paper, scissors):");
        String player1 = scanner.nextLine();
        game.validation(player1);
        System.out.println("Enter Player 2 Choice (rock, paper, scissors):");
        String player2 = scanner.nextLine();
        game.validation(player2);
        System.out.println(game.getJudgment(player1, player2));
    }
}
