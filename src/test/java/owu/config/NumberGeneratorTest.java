package owu.config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {

    @Test
    void givenTwoParamsMinAndMax_whenGenerateNumber_ThanReturnGeneratedValueInBound() {
        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.setMin(56);
        numberGenerator.setMax(58);
        int i = numberGenerator.generateNumber();
        assertEquals(true, i >= 56 && i <= 58);
    }
}