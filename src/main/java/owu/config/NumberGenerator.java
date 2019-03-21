package owu.config;

import lombok.Data;

import java.util.Random;

@Data
public class NumberGenerator {

    private int max = 3;
    private int min = 0;

    public int generateNumber() {
        Random random = new Random();
        int number = random.nextInt(max - min + 1) + min;
        return number;
    }

}
