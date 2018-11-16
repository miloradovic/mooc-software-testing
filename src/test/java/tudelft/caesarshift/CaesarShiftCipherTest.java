package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher shift;

    @BeforeEach
    public void initialize() { this.shift = new CaesarShiftCipher(); }

    @ParameterizedTest(name = "input={0}, shift={1}, expectedResult={2}")
    @CsvSource({
            "abc, 3, def", "xyz, 3, abc", "'', 2, ''", "asd!ASD, 4, 'invalid'",
            "abc, -3, xyz", "abc, 27, bcd", "abc, 0, abc"
    })
    public void multipleTests(String input, int shifter, String expectedResult) {
        Assertions.assertEquals(expectedResult, shift.CaesarShiftCipher(input, shifter));
    }

}
