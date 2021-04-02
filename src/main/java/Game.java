public class Game {
    private String player1;
    private String player2;


    public Game(String player1, String player2){
        this.player1 = player1;
        this.player2 = player2;
        validation();
    }


    String getJudgment(){
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


    void validation(){
        if(!(player1.equals("rock") || player1.equals("paper") || player1.equals("scissors")) || !(player2.equals("rock") || player2.equals("paper") || player2.equals("scissors")))
            throw new IllegalArgumentException("You can only enter 'rock', 'paper' or 'scissors'!");
    }
}
