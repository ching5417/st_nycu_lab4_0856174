import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // This is a comment
        System.out.println("=== Welcome to Rock-Paper-Scissors game ===");
        System.out.println("Enter Player 1 Choice (rock, paper, scissors):");
        String player1 = scanner.nextLine();
        System.out.println("Enter Player 2 Choice (rock, paper, scissors):");
        String player2 = scanner.nextLine();
        Game game = new Game(player1, player2);
        System.out.println(game.getJudgment());
    }
}
