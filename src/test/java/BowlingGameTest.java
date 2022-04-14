import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BowlingGameTest {
    @Test
    public void testNewGame() throws Exception {
        Game g = new Game();
        assertNotNull(g);
    }

    @Test
    public void testGutterGame() throws Exception {
        Game g = new Game();
        for (int i = 0; i < 20; i++) {
            g.roll(0);
        }
    }
}

