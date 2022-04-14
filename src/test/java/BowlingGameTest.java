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
        for (int i = 0; i < 20; i++) {
            g.roll(0);
        }
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes() throws Exception {
        Game g = new Game();
        for (int i = 0; i < 20; i++)
            g.roll(1);
        assertEquals(20, g.score());
    }
}

