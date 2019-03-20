package owu.service;

import org.junit.jupiter.api.Test;
import owu.config.NumberGenerator;
import owu.wire.GameResponse;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {


    @Test
    void givenRightGuess_whenGamePlay_thanReturnPositiveResultInGameResponse() {
        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.setMin(50);
        numberGenerator.setMax(50);
        Game game = new Game();
        game.setNumberGenerator(numberGenerator);
        assertEquals(new GameResponse("Winner", 50), game.play(50));
    }

    @Test
    void givenWrongGuess_whenGamePlay_thanReturnNegativeResultInGameResponse() {
        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.setMin(0);
        numberGenerator.setMax(10);
        Game game = new Game();
        game.setNumberGenerator(numberGenerator);
        assertEquals(new GameResponse("Looser", 50), game.play(50));
    }
}