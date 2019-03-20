package owu.service;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import owu.config.NumberGenerator;
import owu.config.WebInit;
import owu.wire.GameResponse;

@Service
public class Game {


    NumberGenerator numberGenerator;

    @Autowired
    public void setNumberGenerator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public GameResponse play(int gueass) {
        int i = numberGenerator.generateNumber();
        if (i == gueass) {
            return new GameResponse("Winner",gueass);
        } else return new GameResponse("Looser",gueass);
    }
}

