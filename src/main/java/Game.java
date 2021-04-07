public class Game {


    public Game(){
    }


    String getJudgment(String player1, String player2){
        if(player1.equals(player2)){
            return "Draw!";
        }
        else if((player1.equals("rock")&&player2.equals("scissors")) || (player1.equals("paper")&&player2.equals("rock")) || (player1.equals("scissors")&&player2.equals("paper"))){
            return "Player 1 win!";
        }
        else{
            return "Player 2 win!";
        }
    }


    void validation(String input){
        if(!(input.equals("rock") || input.equals("paper") || input.equals("scissors")))
            throw new IllegalArgumentException("You can only enter 'rock', 'paper' or 'scissors'!");
    }
}
