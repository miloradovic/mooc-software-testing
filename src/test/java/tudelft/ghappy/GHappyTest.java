package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    private GHappy happy;

    @BeforeEach
    public void initialize() { this.happy = new GHappy(); }

    @Test
    public void fourGInARow() {
        Assertions.assertTrue(happy.gHappy("xxggggxxyy"));
    }

    @Test
    public void multipleOccurrencesOfG() {
        Assertions.assertTrue(happy.gHappy("vvggggvvvvggggcggggg"));
    }

    @Test
    public void oneGAsInput() {
        Assertions.assertFalse(happy.gHappy("xxxxccccccgbbbbbbbb"));
    }

    @Test
    public void startWithG() {
        Assertions.assertTrue(happy.gHappy("gggllggggggg"));
    }

    @Test
    public void endsWithOneG() {
        Assertions.assertFalse(happy.gHappy("xxcccccccccvvvvvvvvvvvvvvg"));
    }

    @Test
    public void givenEmptyString() {
        Assertions.assertFalse(happy.gHappy(""));
    }
}
