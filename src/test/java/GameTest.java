import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class GameTest {
    // All cases (all win cases, all lose cases, all draw cases, valid input cases)
    static Stream<Arguments> getValidParameters(){
        return Stream.of(
                arguments("rock", "rock", "Draw!"),
                arguments("rock", "paper", "Player 2 win!"),
                arguments("rock", "scissors", "Player 1 win!"),
                arguments("paper", "rock", "Player 1 win!"),
                arguments("paper", "paper", "Draw!"),
                arguments("paper", "scissors", "Player 2 win!"),
                arguments("scissors", "rock", "Player 2 win!"),
                arguments("scissors", "paper", "Player 1 win!"),
                arguments("scissors", "scissors", "Draw!")
        );
    }
    // invalid cases
    static Stream<Arguments> getInvalidParameters(){
        return Stream.of(
                arguments("","","You can only enter 'rock', 'paper' or 'scissors'!"),
                arguments("2021","0327", "You can only enter 'rock', 'paper' or 'scissors'!"),
                arguments("rock", "EVERGREEN", "You can only enter 'rock', 'paper' or 'scissors'!"),
                arguments("!?","paper", "You can only enter 'rock', 'paper' or 'scissors'!"),
                arguments("","scissors", "You can only enter 'rock', 'paper' or 'scissors'!")
        );
    }

    @ParameterizedTest(name="#{index} - Test with Argument: player1=\"{0}\", player2=\"{1}\"")
    @MethodSource("getValidParameters")
    void getJudgmentTest(String player1, String player2, String expected_result) {
        Game game = new Game(player1, player2);
        String actual_result = game.getJudgment();
        assertEquals(expected_result, actual_result);
    }

    @ParameterizedTest(name="#{index} - Test with Argument: player1=\"{0}\", player2=\"{1}\"")
    @MethodSource("getInvalidParameters")
    void validationTest(String player1, String player2, String expected_exception) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Game(player1, player2));
        String actual_exception = exception.getMessage();
        assertTrue(actual_exception.contains(expected_exception));
    }
}