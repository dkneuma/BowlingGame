import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BowlingGameTest {
    @Test
    public void testNewGame() {
        Game g = new Game();
        assertNotNull(g);
    }
}

