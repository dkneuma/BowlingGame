import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {

    @Test
    public void testNewGame()  {
        Game g = new Game();
        assertNotNull(g);
    }

    @Test
    public void testGutterGame()  {
        Game g = new Game();
        int rolls = 20;
        int pins = 0;
        for (int i = 0; i < rolls; i++)
            g.roll(pins);
        assertEquals(0, g.score());
    }

}

